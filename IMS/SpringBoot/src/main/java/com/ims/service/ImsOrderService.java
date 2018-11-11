package com.ims.service;

import com.ims.entity.ImsOrder;
import com.ims.entity.VwOrder;

import java.util.List;

/**
 * @author asus
 */
public interface ImsOrderService {
    /**
     * 新增订单
     *
     * @param imsOrder
     * @return
     */
    public int saveOrder(ImsOrder imsOrder);

    /**
     * 删除
     *
     * @param imsOrder
     * @return
     */
    int deleteOrder(ImsOrder imsOrder);

    /**
     * 修改订单
     *
     * @param imsOrder
     * @return
     */
    public int updateOrder(ImsOrder imsOrder);

    /**
     * 查询所有的订单
     *
     * @return
     */
    List<VwOrder> getAllVwOrders(String type);

    /**
     * 根据单号查找订单
     *
     * @param orderNo
     * @return
     */
    ImsOrder getOneOrder(Integer orderNo);

    /**
     * 批量删除订单
     *
     * @param idList
     */
    void deleteOrders(List<Integer> idList);

    /**
     * 批量入库审核订单
     *
     * @param idList
     */
    void checkOrdersIn(List<Integer> idList);
    /**
     * 批量出库审核订单
     *
     * @param idList
     */
    void checkOrdersOut(List<Integer> idList);
}
