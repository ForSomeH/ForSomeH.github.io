package com.ims.service;

import com.ims.entity.ImsCustomer;
import com.ims.entity.ImsProduct;
import com.ims.entity.VwProduct;

import java.util.List;


/**
 * @author asus
 */
public interface ImsProductService {
    /**
     * 保存新产品
     *
     * @param imsProduct
     * @return
     */
    int saveProduct(ImsProduct imsProduct);

    /**
     * 获取所有的产品
     *
     * @return
     */
    List<VwProduct> getAllVwProduct();

    int updateProduct(ImsProduct imsProduct);

    /**
     * 删除产品
     * @param imsProduct
     * @return
     */
    int deleteProduct(ImsProduct imsProduct);
}
