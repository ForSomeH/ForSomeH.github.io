package com.ims.service;

import com.ims.entity.ImsProduct;
import com.ims.entity.ImsStock;
import com.ims.entity.ImsStockProduct;

import java.util.List;

/**
 * @author asus
 */
public interface ImsStockProductService {
    /**
     * 更新仓库商品的数量
     */
    void updateProducts(ImsStock stock, ImsProduct product, String Num);

    /**
     * 获取全部仓库的商品信息
     *
     * @return
     */
    List<ImsStockProduct> getAllStockProducts(Integer stockNo);
}
