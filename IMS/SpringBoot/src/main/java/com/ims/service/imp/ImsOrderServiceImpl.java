package com.ims.service.imp;

import com.ims.entity.*;
import com.ims.mapper.ImsOrderMapper;
import com.ims.mapper.ImsProductMapper;
import com.ims.mapper.ImsStockMapper;
import com.ims.mapper.VwOrderMapper;
import com.ims.service.ImsOrderExtendService;
import com.ims.service.ImsOrderService;
import com.ims.service.ImsStockProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsOrderServiceImpl implements ImsOrderService {
    @Resource
    ImsOrderMapper imsOrderMapper;
    @Resource
    VwOrderMapper vwOrderMapper;
    @Resource
    ImsStockMapper imsStockMapper;
    @Resource
    ImsProductMapper imsProductMapper;
    @Autowired
    ImsOrderExtendService imsOrderExtendService;
    @Autowired
    ImsStockProductService imsStockProductService;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增
     *
     * @param imsOrder
     * @return
     */
    @Override
    public int saveOrder(ImsOrder imsOrder) {
        imsOrder.setCreater(commonMethod.getUser());
        imsOrder.setCrateTime(commonMethod.getDate());
        //订单初始状态
        imsOrder.setOrderCost("0");
        imsOrder.setOrderStatus("2");
        imsOrder.setIsDeleted("N");
        imsOrderMapper.insert(imsOrder);
        return imsOrder.getOrderNo();
    }

    /**
     * 删除
     *
     * @param imsOrder
     * @return
     */
    @Override
    public int deleteOrder(ImsOrder imsOrder) {
        ImsOrder order = imsOrderMapper.selectByPrimaryKey(imsOrder.getOrderNo());
        commonMethod.setModifier(order);
        order.setIsDeleted("Y");
        return imsOrderMapper.updateByPrimaryKey(order);
    }

    /**
     * 修改
     *
     * @param imsOrder
     * @return
     */
    @Override
    public int updateOrder(ImsOrder imsOrder) {
        imsOrder.setLastModifier(commonMethod.getUser());
        imsOrder.setLastModifyerTime(commonMethod.getDate());
        return imsOrderMapper.updateByPrimaryKey(imsOrder);
    }


    /**
     * 获得所有的订单
     *
     * @return
     */
    @Override
    public List<VwOrder> getAllVwOrders(String type) {
        VwOrderExample vmsOrderExample = new VwOrderExample();
        vmsOrderExample.createCriteria().andOrderTypeEqualTo(type).andIsDeletedEqualTo("N");
        return vwOrderMapper.selectByExample(vmsOrderExample);
    }

    /**
     * 根据单号查找订单
     *
     * @param orderNo
     * @return
     */
    @Override
    public ImsOrder getOneOrder(Integer orderNo) {
        return imsOrderMapper.selectByPrimaryKey(orderNo);
    }

    /**
     * 批量删除订单
     *
     * @param idList
     */
    @Override
    public void deleteOrders(List<Integer> idList) {
        for (Integer orderNo : idList) {
            ImsOrder imsOrder = imsOrderMapper.selectByPrimaryKey(orderNo);
            imsOrder.setIsDeleted("Y");
            commonMethod.setModifier(imsOrder);
            imsOrderMapper.updateByPrimaryKey(imsOrder);
        }
    }

    /**
     * 批量审核入库订单
     *
     * @param idList
     */
    @Override
    public void checkOrdersIn(List<Integer> idList) {
        ImsOrderExample imsOrderExample = new ImsOrderExample();
        imsOrderExample.createCriteria().andOrderNoIn(idList);
        List<ImsOrder> imsOrders = imsOrderMapper.selectByExample(imsOrderExample);
        for (ImsOrder imsOrder : imsOrders) {
            if ("2".equals(imsOrder.getOrderStatus())) {
                //设置订单状态为已审核
                imsOrder.setOrderStatus("3");
                //选择库房编号
                Integer stockNo = new Integer("1");
                //获取订单明细全部产品信息
                List<VwOrderExtend> imsOrderExtends = imsOrderExtendService.getOrderExtendInfo(imsOrder.getOrderNo());
                //进行每个产品的数量删改
                for (VwOrderExtend imsOrderExtend : imsOrderExtends) {
                    imsStockProductService.updateProducts(imsStockMapper.selectByPrimaryKey(stockNo), imsProductMapper.selectByPrimaryKey(imsOrderExtend.getProductNo()), imsOrderExtend.getProductNum().toString());
                }
                //更新订单状态
                imsOrderMapper.updateByPrimaryKey(imsOrder);
                //生成账单
            }
        }
    }

    /**
     * 批量审核出库订单
     *
     * @param idList
     */
    @Override
    public void checkOrdersOut(List<Integer> idList) {
        ImsOrderExample imsOrderExample = new ImsOrderExample();
        imsOrderExample.createCriteria().andOrderNoIn(idList);
        List<ImsOrder> imsOrders = imsOrderMapper.selectByExample(imsOrderExample);
        for (ImsOrder imsOrder : imsOrders) {
            //2为待审核的订单
            if ("2".equals(imsOrder.getOrderStatus())) {
                //设置订单状态为已审核
                imsOrder.setOrderStatus("3");
                //选择库房编号
                Integer stockNo = new Integer("1");
                //获取订单全部产品信息明细
                List<VwOrderExtend> imsOrderExtends = imsOrderExtendService.getOrderExtendInfo(imsOrder.getOrderNo());
                //判断是否有足够的商品可售出
//                if(enoughProduct())
                //进行每个产品的数量删改
                for (VwOrderExtend imsOrderExtend : imsOrderExtends) {
                    imsStockProductService.updateProducts(imsStockMapper.selectByPrimaryKey(stockNo), imsProductMapper.selectByPrimaryKey(imsOrderExtend.getProductNo()), "-" + imsOrderExtend.getProductNum());
                }
                //更新订单状态
                imsOrderMapper.updateByPrimaryKey(imsOrder);
                //生成账单
            }
        }
    }
}
