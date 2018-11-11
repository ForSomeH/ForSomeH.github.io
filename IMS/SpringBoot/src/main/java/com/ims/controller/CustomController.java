package com.ims.controller;

import com.ims.entity.ImsCustomer;
import com.ims.service.ImsCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 洪政伟
 */
@RequestMapping("custom")
@Controller
public class CustomController {
    @Autowired
    ImsCustomerService imsCustomerService;


    /**
     * 新增客户
     */
    @ResponseBody
    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String addCustomer(@RequestBody ImsCustomer imsCustomer) {
        imsCustomer.setCustomerType("客户");
        if (imsCustomerService.saveCustomer(imsCustomer) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }
    }

    /**
     * 新增厂家
     *
     * @param imsCustomer
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addSupplier", method = RequestMethod.POST)
    public String addSupplier(@RequestBody ImsCustomer imsCustomer) {
        imsCustomer.setCustomerType("厂家");
        if (imsCustomerService.saveCustomer(imsCustomer) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }

    }

    /**
     * 删除
     *
     * @param imsCustomer
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteCustom", method = RequestMethod.POST)
    public String deleteCustom(@RequestBody ImsCustomer imsCustomer) {
        if (imsCustomerService.deleteCustomer(imsCustomer) != -1) {
            return "删除成功";
        } else {
            return "删除失败";
        }

    }

    /**
     * 改
     *
     * @param imsCustomer
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateCustom", method = RequestMethod.POST)
    public String updateCustom(@RequestBody ImsCustomer imsCustomer) {
        if (imsCustomerService.updateCustomer(imsCustomer) != -1) {
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
    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.POST)
    public List<ImsCustomer> getAllCustomer() {
        List<ImsCustomer> imsCustomers = imsCustomerService.getAllCustomer("客户");
        return imsCustomers;
    }

    /**
     * 获得所有厂家信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllSupplier", method = RequestMethod.POST)
    public List<ImsCustomer> getAllSupplier() {
        List<ImsCustomer> imsCustomers = imsCustomerService.getAllCustomer("厂家");
        return imsCustomers;
    }
}
