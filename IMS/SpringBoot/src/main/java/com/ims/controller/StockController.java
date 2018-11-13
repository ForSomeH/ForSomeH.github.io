package com.ims.controller;

import com.ims.entity.ImsStock;
import com.ims.entity.ImsType;
import com.ims.service.ImsStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("stock")
public class StockController {
    @Autowired
    ImsStockService imsStockService;


    /**
     * 增加
     *
     * @param imsStock
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addStock", method = RequestMethod.POST)
    public String addStock(@RequestBody ImsStock imsStock) {
        if (imsStockService.saveStock(imsStock) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }
    }
    /**
     * 删除
     */
    @ResponseBody
    @RequestMapping(value = "/deleteStock", method = RequestMethod.POST)
    public String deleteStock(@RequestBody ImsStock imsStock) {
        if (imsStockService.deleteStock(imsStock) != -1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    /**
     * 更改
     *
     * @param imsStock
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateStock", method = RequestMethod.POST)
    public String updateStock(@RequestBody ImsStock imsStock) {
        if (imsStockService.updateStock(imsStock) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }
    }
    /**
     * 查询
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllStock", method = RequestMethod.POST)
    public List<ImsStock> getAllStock() {
        List<ImsStock> imsStocks = imsStockService.getAllStocks();
        return imsStocks;
    }
}
