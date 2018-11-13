package com.ims.controller;


import com.ims.entity.ImsUser;
import com.ims.service.ImsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    ImsUserService imsUserService;
    @Autowired
    HttpServletRequest request;

    /**
     * 登陆校验
     *
     * @param imsUser
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "logincheck", method = RequestMethod.POST)
    public String testspringboot(@RequestBody ImsUser imsUser) {
        ImsUser DbUser = imsUserService.checkUser(imsUser.getUserName(), imsUser.getUserPassword());
        if (DbUser != null) {
            request.getSession().setAttribute("userName", DbUser.getUserName());
            request.getSession().setAttribute("userCode", DbUser.getUserCode());
            return DbUser.getUserName();
        }
        return null;
    }

    /**
     * 获得用户名称
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    public String getUser() {
        return request.getSession().getAttribute("userName").toString();
    }

    /**
     * 返回登陆页
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    /**
     * 菜单页
     *
     * @return
     */
    @RequestMapping("/Menu")
    public String menu() {
        return "Menu";
    }

    /**
     * 客户管理页
     *
     * @return
     */
    @RequestMapping("/customMange")
    public String customMange() {
        return "customMange";
    }

    /**
     * 仓库管理页
     *
     * @return
     */
    @RequestMapping("/stockMange")
    public String stockMange() {
        return "stockMange";
    }

    /**
     * 厂家管理页
     *
     * @return
     */
    @RequestMapping("/supplierMange")
    public String supplierMange() {
        return "supplierMange";
    }

    /**
     * 商品管理页
     *
     * @return
     */
    @RequestMapping("/productMange")
    public String productMange() {
        return "productMange";
    }

    /**
     * 厂家管理页
     *
     * @return
     */
    @RequestMapping("/typeMange")
    public String typeMange(Model model) {

        return "typeMange";
    }

    /**
     * 订单管理
     *
     * @param model
     * @return
     */
    @RequestMapping("/billMange")
    public String billMange(Model model) {

        return "billMange";
    }

    /**
     * 返回首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String indexhmtl1() {
        return "index";
    }

    /**
     * 采购订单管理
     *
     * @return
     */
    @RequestMapping("/PurchaseOrder")
    public String orderAdd() {
        return "PurchaseOrder";
    }

    /**
     * 销售出库
     *
     * @return
     */
    @RequestMapping("/SalesOrder")
    public String orderExtendOutMange() {
        return "SalesOrder";
    }

    /**
     * 订单扩展查看
     *
     * @return
     */
    @RequestMapping("/orderExtendView")
    public String orderView() {
        return "orderExtendView";
    }

    /**
     * 销售管理
     *
     * @return
     */
    @RequestMapping("/SalesOrderMange")
    public String orderMangeOut() {
        return "SalesOrderMange";
    }

    /**
     * 订单管理页
     *
     * @return
     */
    @RequestMapping("/PurchaseOrderMange")
    public ModelAndView menu1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("PurchaseOrderMange");
        return mav;
    }

    /**
     * 订单入库操作界面
     */
    @RequestMapping("/Warehousing")
    public String Warehousing() {
        return "Warehousing";
    }

    /**
     * 订单出库操作界面
     */
    @RequestMapping("/Delivery")
    public String Delivery() {
        return "Delivery";
    }

    /**
     * 入库管理界面
     *
     * @return
     */
    @RequestMapping("/InStockMange")
    public String InStockMange() {
        return "InStockMange";
    }

    /**
     * 入库管理明细界面
     *
     * @return
     */
    @RequestMapping("/InStock")
    public String InStock() {
        return "InStock";
    }

    /**
     * 出库管理界面
     *
     * @return
     */
    @RequestMapping("/outStockMange")
    public String outStockMange() {
        return "InStockMange";
    }

}
