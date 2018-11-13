package com.ims.controller;

import com.ims.entity.ImsStockProduct;
import com.ims.entity.VwStock;
import com.ims.entity.VwStockExample;
import com.ims.mapper.VwStockMapper;
import com.ims.service.ImsStockProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 仓库的控制
 */
@Controller
@RequestMapping("stockProduct")
public class ImsStockProductController {
    @Autowired
    ImsStockProductService imsStockProductService;

    @Resource
    VwStockMapper vwStockMapper;

    /**
     * 查看全部的仓库商品
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/queryStockProoducts", method = RequestMethod.POST)
    public List<VwStock> queryStockProoducts() {
        VwStockExample vwStockExample = new VwStockExample();
        vwStockExample.createCriteria().andProductNoIsNotNull();
        List<VwStock> vwStocks = vwStockMapper.selectByExample(vwStockExample);
        return vwStocks;
    }


}
