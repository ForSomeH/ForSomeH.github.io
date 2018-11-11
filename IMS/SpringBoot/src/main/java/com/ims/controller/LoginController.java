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

    @RequestMapping("/PurchaseOrder")
    public String orderAdd() {
        return "PurchaseOrder";
    }

    @RequestMapping("/orderExtendOutMange")
    public String orderExtendOutMange() {
        return "orderExtendOutMange";
    }

    @RequestMapping("/orderExtendView")
    public String orderView() {
        return "orderExtendView";
    }

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
}
