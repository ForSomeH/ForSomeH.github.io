package com.ims.controller;

import com.ims.entity.ImsProduct;
import com.ims.entity.ImsProductExample;
import com.ims.entity.VwProduct;
import com.ims.service.ImsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 洪政伟
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    ImsProductService imsProductService;

    /**
     * 增加
     *
     * @param imsProduct
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addProduct(@RequestBody ImsProduct imsProduct) {
        if (imsProductService.saveProduct(imsProduct) != -1) {
            return "保存成功";
        } else {
            return "保存失败";
        }
    }


    /**
     * 删除
     *
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
    public String deleteProduct(@RequestParam String ids) {
        System.out.println("!23");

//        if (imsProductService.deleteProduct(imsProduct) != -1) {
//            return "删除成功";
//        } else {
        return "删除失败";
//        }
    }

    /**
     * 更改
     *
     * @param imsProduct
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public String updateProduct(@RequestBody ImsProduct imsProduct) {
        if (imsProductService.updateProduct(imsProduct) != -1) {
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
    @RequestMapping(value = "/getAllProducts", method = RequestMethod.POST)
    public List<VwProduct> getAllProducts() {
        return imsProductService.getAllVwProduct();
    }

}
