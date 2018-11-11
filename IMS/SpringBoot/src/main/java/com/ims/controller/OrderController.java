package com.ims.controller;

import com.ims.entity.ImsCustomer;
import com.ims.entity.ImsOrder;
import com.ims.entity.VwOrder;
import com.ims.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    ImsTypeService imsTypeService;
    @Autowired
    ImsProductService imsProductService;
    @Autowired
    ImsCustomerService imsCustomerService;
    @Autowired
    ImsStockService imsStockService;
    @Autowired
    ImsOrderService imsOrderService;

    /**
     * 新增订单
     *
     * @param imsOrder
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public int saveOrder(@RequestBody ImsOrder imsOrder) {
        return imsOrderService.saveOrder(imsOrder);
    }

    /**
     * 删除
     *
     * @param imsOrder
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteOrder", method = RequestMethod.POST)
    public int deleteOrder(@RequestBody ImsOrder imsOrder) {
        return imsOrderService.deleteOrder(imsOrder);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteOrders", method = RequestMethod.POST)
    public String deleteOrders(@RequestParam String ids) {
        String[] idStr = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idStr) {
            idList.add(new Integer(id));
        }
        imsOrderService.deleteOrders(idList);
        return "删除成功";
    }

    /**
     * 批量审核
     *
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkOrdersIn", method = RequestMethod.POST)
    public String checkOrders(@RequestParam String ids) {
        String[] idStr = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idStr) {
            idList.add(new Integer(id));
        }
        imsOrderService.checkOrdersIn(idList);
        return "审核成功";
    }
    /**
     * 批量审核
     *
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkOrdersOut", method = RequestMethod.POST)
    public String checkOrdersOut(@RequestParam String ids) {
        String[] idStr = ids.split(",");
        List<Integer> idList = new ArrayList<>();
        for (String id : idStr) {
            idList.add(new Integer(id));
        }
        imsOrderService.checkOrdersOut(idList);
        return "审核成功";
    }
    /**
     * 更改、编辑
     *
     * @param imsOrder
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public int updateOrder(@RequestBody ImsOrder imsOrder) {
        return imsOrderService.updateOrder(imsOrder);
    }


    /**
     * 查询一条
     *
     * @param imsOrder
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getOrder", method = RequestMethod.POST)
    public ImsOrder getOrder(@RequestBody ImsOrder imsOrder) {
        return imsOrderService.getOneOrder(imsOrder.getOrderNo());
    }

    /**
     * 查询全部订单
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllOrderIn", method = RequestMethod.POST)
    public List<VwOrder> getAllOrderIn(@RequestParam String type) {
        List<VwOrder> vwImsOrders = imsOrderService.getAllVwOrders(type);
        return vwImsOrders;
    }


}
