package com.ims.controller;

import com.ims.entity.*;
import com.ims.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * TypeController.class
 *
 * @author 洪政伟
 */

@RequestMapping("type")
@Controller
public class TypeController {

    @Autowired
    ImsTypeService imsTypeService;
    @Autowired
    ImsProductService imsProductService;
    @Autowired
    ImsCustomerService imsCustomerService;

    @Autowired
    ImsOrderService imsOrderService;

    /**
     * 新增
     *
     * @param imsType
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addType", method = RequestMethod.POST)
    public String addType(@RequestBody ImsType imsType) {
        if (imsTypeService.saveType(imsType) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }
    }

    /**
     * 删除
     */
    @ResponseBody
    @RequestMapping(value = "/deleteType", method = RequestMethod.POST)
    public String deleteType(@RequestBody ImsType imsType) {
        if (imsTypeService.deleteType(imsType) != -1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    /**
     * 更改
     *
     * @param imsType
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateType", method = RequestMethod.POST)
    public String updateType(@RequestBody ImsType imsType) {
        if (imsTypeService.updateType(imsType) != -1) {
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
    @RequestMapping(value = "/getAllTypes", method = RequestMethod.POST)
    public List<ImsType> getAllTypes() {
        List<ImsType> imsTypes = imsTypeService.getAllTypes();
        return imsTypes;
    }
}
