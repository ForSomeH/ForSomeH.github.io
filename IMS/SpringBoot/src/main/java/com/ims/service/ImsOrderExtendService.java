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
    public int saveOrderExtend(ImsOrderExtend imsOrderExtend);

    /**
     * 查找一条订单的所有产品信息
     *
     * @param OrderNo
     * @return
     */
    public List<VwOrderExtend> getOrderExtendInfo(Integer OrderNo);

    /**
     * 批量删除订单产品信息
     * @param ids
     */
    void deleteOrderExtends(List<Integer> ids,Integer orderNo);

}
