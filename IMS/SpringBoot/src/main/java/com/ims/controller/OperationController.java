package com.ims.controller;

import com.ims.entity.*;
import com.ims.service.ImsOperationService;
import com.ims.service.ImsOrderExtendService;
import com.ims.service.ImsOrderService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author 洪政伟
 */
@Controller
@RequestMapping("Operation")
public class OperationController {
    @Autowired
    ImsOperationService imsOperationService;
    @Autowired
    ImsOrderService imsOrderService;
    @Autowired
    ImsOrderExtendService imsOrderExtendService;

    /**
     * 新增操作主表及子表
     *
     * @param goodsRecords
     * @param orderNo
     * @param type
     */
    @ResponseBody
    @RequestMapping(value = "/addNewOperation", method = RequestMethod.POST)
    public String addNew(@RequestParam("goodsRecords") String goodsRecords, @RequestParam("orderNo") Integer orderNo, @RequestParam("type") String type, @RequestParam("orderStock") String orderStock) {
        //新增主表

        List<ImsOperationDetail> list2 = (List<ImsOperationDetail>) JSONArray.toList(JSONArray.fromObject(goodsRecords), ImsOperationDetail.class);
        boolean zero = false;
        for (ImsOperationDetail imsOperationDetail : list2) {
            if (!imsOperationDetail.getOperationNum().equals("0")) {
                zero = true;
            }
        }
        if (!zero) {
            return "请选择商品入库";
        }
        int OperationNo = imsOperationService.addNew(orderNo.toString(), type, orderStock);
        for (ImsOperationDetail imsOperationDetail : list2) {
            //如果数量为0则不进行操作
            if (!imsOperationDetail.getOperationNum().equals("0")) {
                imsOperationDetail.setOperationNo(OperationNo + "");
                //新增子表数据
                imsOperationService.addNewSon(imsOperationDetail);
                //增加订单已操作商品数量
                imsOrderExtendService.updateProductNum(orderNo, imsOperationDetail.getProductNo(), Integer.parseInt(imsOperationDetail.getOperationNum()));
                switch (type) {
                    case "1": {
                        //入库单对库房的操作

                    }
                    case "4":{
                        //出库单对库房的影响
                    }
                    break;
                    default:
                        break;
                }
            }
        }
        return "操作成功";
    }

    /**
     * 查询全部操作
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllOperation", method = RequestMethod.POST)
    public List<VwOperation> getAllOrderIn(@RequestParam String type) {
        List<VwOperation> vwOperations = imsOperationService.getAllOperation(type);
        return vwOperations;
    }

    /**
     * 查询一条
     *
     * @param imsOperation
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getOperation", method = RequestMethod.POST)
    public VwOperation getOperation(@RequestBody ImsOperation imsOperation) {
        return imsOperationService.getOperation(imsOperation.getOperationNo());
    }

    /**
     * 查询全部明细
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getOperationDetail", method = RequestMethod.POST)
    public List<VwOperationDetail> getOperationDetail(@RequestBody VwOperationDetail vwOperationDetail) {
        List<VwOperationDetail> vwOperationDetails = imsOperationService.getOperationDetail(vwOperationDetail.getOperationNo());
        return vwOperationDetails;
    }
}
