package com.ims.service;

import com.ims.entity.ImsOrder;
import com.ims.entity.ImsOrderExtend;
import com.ims.entity.VwOrder;
import com.ims.entity.VwOrderExtend;

import java.util.List;

/**
 * @author asus
 */
public interface ImsOrderExtendService {
    /**
     * 新增订单
     *
     * @param imsOrderExtend
     * @return
     */
    int saveOrderExtend(ImsOrderExtend imsOrderExtend);

    /**
     * 查找一条订单的所有产品信息
     *
     * @param OrderNo
     * @return
     */
    List<VwOrderExtend> getOrderExtendInfo(Integer OrderNo);

    /**
     * * 批量删除订单产品信息
     *
     * @param ids
     * @param orderNo
     */
    void deleteOrderExtends(List<Integer> ids, Integer orderNo);

    /**
     * 更新商品已入库数量
     *
     * @param orderNo
     * @param productNo
     * @param productNum
     */
    void updateProductNum(int orderNo, int productNo, int productNum);

}
