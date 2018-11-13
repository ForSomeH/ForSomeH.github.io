package com.ims.service;

import com.ims.entity.ImsOperation;
import com.ims.entity.ImsOperationDetail;
import com.ims.entity.VwOperation;
import com.ims.entity.VwOperationDetail;

import java.util.List;

public interface ImsOperationService {
    /**
     * 新增操作表
     *
     * @param orderNo
     * @param type
     * @param stockNo
     * @return
     */
    int addNew(String orderNo, String type, String stockNo);

    /**
     * 新增操作子表
     * @param imsOperationDetail
     */
    void addNewSon(ImsOperationDetail imsOperationDetail);

    /**
     * 获取全部的某一类型操作单
     * @param type
     * @return
     */
    List<VwOperation> getAllOperation(String type);

    /**
     * 获取某一操作单
     * @param operationNo
     * @return
     */
    VwOperation getOperation(Integer operationNo);

    /**
     *获取某一操作单明细
     * @param operationNo
     * @return
     */
    List<VwOperationDetail> getOperationDetail(String operationNo);
}
