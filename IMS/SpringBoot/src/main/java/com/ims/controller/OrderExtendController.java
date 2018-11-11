package com.ims.controller;

import com.ims.entity.*;
import com.ims.mapper.ImsOrderExtendMapper;
import com.ims.mapper.ImsOrderMapper;
import com.ims.service.*;


import com.ims.service.imp.CommonMethod;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("orderExtend")
public class OrderExtendController {
    @Autowired
    ImsTypeService imsTypeService;
    @Autowired
    ImsProductService imsProductService;
    @Autowired
    ImsCustomerService imsCustomerService;
    @Autowired
    ImsStockService imsStockService;
    @Autowired
    ImsOrderExtendService imsOrderExtendService;
    @Resource
    ImsOrderMapper imsOrderMapper;
    @Resource
    ImsOrderExtendMapper imsOrderExtendMapper;
    @Autowired
    ImsOrderService imsOrderService;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增订单明细
     *
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrderExtend", method = RequestMethod.POST)
    public int saveOrderExtend(@RequestParam("userScoreRecords") String userScoreRecords, @RequestParam("orderNo") Integer orderNo, @RequestParam("orderCustomer") String orderCustomer) {
        List<VwOrderExtend> list2 = (List<VwOrderExtend>) JSONArray.toList(JSONArray.fromObject(userScoreRecords), VwOrderExtend.class);
        for (VwOrderExtend vwOrderExtend : list2) {
            ImsOrderExtend imsOrderExtend = new ImsOrderExtend();
            imsOrderExtend.setOrderNo(orderNo);
            imsOrderExtend.setProductNo(vwOrderExtend.getProductNo());
            imsOrderExtend.setProductNum(vwOrderExtend.getProductNum());
            imsOrderExtendService.saveOrderExtend(imsOrderExtend);
        }
        //更新订单的更新时间
        ImsOrder imsOrder = imsOrderMapper.selectByPrimaryKey(orderNo);
        commonMethod.setModifier(imsOrder);
        //计算订单总体金额更新
        int total = 0;
        for (int i = 0; i < list2.size(); i++) {
            total += (list2.get(i).getProductNum() * Integer.parseInt(list2.get(i).getProductPrice()));
        }
        imsOrder.setOrderCost(total + "");
        imsOrder.setOrderCustomer(orderCustomer);
        imsOrderService.updateOrder(imsOrder);
        return 1;

    }

    /**
     * 删除订单明细商品
     *
     * @param ids
     * @param orderNo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    public String deleteProduct(@RequestParam String ids, @RequestParam Integer orderNo) {
        String[] idStr = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idStr) {
            idList.add(new Integer(id));
        }
        imsOrderExtendService.deleteOrderExtends(idList, orderNo);
        return "删除成功";
    }

    /**
     * 查询全部订单明细
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getOrderExtends", method = RequestMethod.POST)
    public List<VwOrderExtend> getOrderExtends(@RequestBody ImsOrderExtend imsOrderExtend) {
        List<VwOrderExtend> vwOrderExtends = imsOrderExtendService.getOrderExtendInfo(imsOrderExtend.getOrderNo());
        return vwOrderExtends;
    }

    /**
     * 获得所有订单客户信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllorderExtendCustomer", method = RequestMethod.POST)
    public List<ImsCustomer> getAllorderExtendCustomer() {
        List<ImsCustomer> imsCustomers = imsCustomerService.getAllCustomer("客户");
        return imsCustomers;
    }
}
