package com.ims.service.imp;

import com.ims.entity.*;
import com.ims.mapper.ImsOrderExtendMapper;
import com.ims.mapper.ImsOrderMapper;
import com.ims.mapper.VwOrderExtendMapper;
import com.ims.mapper.VwOrderMapper;
import com.ims.service.ImsOrderExtendService;
import com.ims.service.ImsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsOrderExtendServiceImpl implements ImsOrderExtendService {
    @Resource
    ImsOrderExtendMapper imsOrderExtendMapper;
    @Resource
    VwOrderExtendMapper vwOrderExtendMapper;
    @Autowired
    CommonMethod commonMethod;


    /**
     * 新增订单
     *
     * @param imsOrderExtend
     * @return
     */
    @Override
    public int saveOrderExtend(ImsOrderExtend imsOrderExtend) {
        //检查该订单是否已存在该订单
        ImsOrderExtendExample imsOrderExtendExample = new ImsOrderExtendExample();
        imsOrderExtendExample.createCriteria().andOrderNoEqualTo(imsOrderExtend.getOrderNo()).andProductNoEqualTo(imsOrderExtend.getProductNo());
        List<ImsOrderExtend> imsOrderExtends = imsOrderExtendMapper.selectByExample(imsOrderExtendExample);
        if (imsOrderExtends.size() != 0) {
            commonMethod.setModifier(imsOrderExtends.get(0));
            imsOrderExtends.get(0).setProductNum(imsOrderExtend.getProductNum());
            imsOrderExtendMapper.updateByPrimaryKey(imsOrderExtends.get(0));
        } else {
            imsOrderExtend.setCrateTime(commonMethod.getDate());
            imsOrderExtend.setCreater(commonMethod.getUser());
            imsOrderExtend.setIsDeleted("N");
            imsOrderExtendMapper.insert(imsOrderExtend);
        }

        return 0;
    }

    /**
     * 查找一条订单的所有产品信息
     *
     * @param orderNo
     * @return
     */
    @Override
    public List<VwOrderExtend> getOrderExtendInfo(Integer orderNo) {
        VwOrderExtendExample vwOrderExtendExample = new VwOrderExtendExample();
        vwOrderExtendExample.createCriteria().andOrderNoEqualTo(orderNo).andIsDeletedEqualTo("N");
        return vwOrderExtendMapper.selectByExample(vwOrderExtendExample);
    }

    /**
     * 批量删除订单产品信息
     *
     * @param ids
     */
    @Override
    public void deleteOrderExtends(List<Integer> ids, Integer orderNo) {
        ImsOrderExtendExample imsOrderExtendExample = new ImsOrderExtendExample();
        imsOrderExtendExample.createCriteria().andOrderNoEqualTo(orderNo).andProductNoIn(ids);
        List<ImsOrderExtend> imsOrderExtends = imsOrderExtendMapper.selectByExample(imsOrderExtendExample);
        for (ImsOrderExtend imsOrderExtend : imsOrderExtends) {
            imsOrderExtend.setIsDeleted("Y");
            imsOrderExtendMapper.updateByPrimaryKey(imsOrderExtend);
        }
    }

    /**
     * 更新商品已入库数量
     *
     * @param orderNo
     * @param productNo
     * @param productNum
     */
    @Override
    public void updateProductNum(int orderNo, int productNo, int productNum) {
        ImsOrderExtendExample imsOrderExtendExample = new ImsOrderExtendExample();
        imsOrderExtendExample.createCriteria().andOrderNoEqualTo(orderNo).andProductNoEqualTo(productNo);
        ImsOrderExtend imsOrderExtend = imsOrderExtendMapper.selectByExample(imsOrderExtendExample).get(0);
        int newNum = (imsOrderExtend.getProductDoneNum()==null?0:imsOrderExtend.getProductDoneNum()) + productNum;
        imsOrderExtend.setProductDoneNum(newNum);
        imsOrderExtendMapper.updateByPrimaryKey(imsOrderExtend);
    }
}
