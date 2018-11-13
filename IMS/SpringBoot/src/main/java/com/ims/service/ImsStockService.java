package com.ims.service;

import com.ims.entity.ImsStock;
import com.ims.entity.ImsType;

import java.util.List;

/**
 * @author 洪政伟
 */
public interface ImsStockService {
    /**
     * 新增
     * @param imsStock
     * @return
     */
    int saveStock(ImsStock imsStock);

    /**
     * 删除
     * @param imsStock
     * @return
     */
    int deleteStock(ImsStock imsStock);

    /**
     * 更改
     * @param imsStock
     * @return
     */
    int updateStock(ImsStock imsStock);

    /**
     * 查询
     * @return
     */
    List<ImsStock> getAllStocks();




}
