package com.ims.service.imp;


import com.ims.entity.*;
import com.ims.mapper.ImsOperationDetailMapper;
import com.ims.mapper.ImsOperationMapper;
import com.ims.mapper.VwOperationDetailMapper;
import com.ims.mapper.VwOperationMapper;
import com.ims.service.ImsOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 洪政伟
 */
@Service
public class ImsOperationServiceImpl implements ImsOperationService {
    @Resource
    ImsOperationMapper imsOperationMapper;
    @Resource
    VwOperationMapper vwOperationMapper;
    @Resource
    VwOperationDetailMapper vwOperationDetailMapper;
    @Resource
    ImsOperationDetailMapper imsOperationDetailMapper;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增操作主表
     *
     * @param orderNo
     * @param type
     * @param stockNo
     * @return
     */
    @Override
    public int addNew(String orderNo, String type, String stockNo) {
        ImsOperation imsOperation = new ImsOperation();
        imsOperation.setOperationStock(stockNo);
        imsOperation.setOrderNo(orderNo);
        imsOperation.setOperationType(type);
        commonMethod.setCreator(imsOperation);
        imsOperationMapper.insert(imsOperation);
        return imsOperation.getOperationNo();
    }

    /**
     * 新增操作子表
     *
     * @param imsOperationDetail
     */
    @Override
    public void addNewSon(ImsOperationDetail imsOperationDetail) {
        commonMethod.setCreator(imsOperationDetail);
        imsOperationDetailMapper.insert(imsOperationDetail);
    }

    /**
     * 获取全部的某一操作单
     *
     * @param type
     * @return
     */
    @Override
    public List<VwOperation> getAllOperation(String type) {
        VwOperationExample vwOperationExample = new VwOperationExample();
        vwOperationExample.createCriteria().andOperationTypeEqualTo(type);
        return vwOperationMapper.selectByExample(vwOperationExample);
    }

    /**
     * 获取某一操作单
     *
     * @param operationNo
     * @return
     */
    @Override
    public VwOperation getOperation(Integer operationNo) {
        VwOperationExample vwOperationExample = new VwOperationExample();
        vwOperationExample.createCriteria().andOperationNoEqualTo(operationNo);
        return vwOperationMapper.selectByExample(vwOperationExample).get(0);
    }

    /**
     * 获取某一操作单明细
     *
     * @param operationNo
     * @return
     */
    @Override
    public List<VwOperationDetail> getOperationDetail(String operationNo) {
        VwOperationDetailExample vwOperationDetailExample = new VwOperationDetailExample();
        vwOperationDetailExample.createCriteria().andOperationNoEqualTo(operationNo);
        return vwOperationDetailMapper.selectByExample(vwOperationDetailExample);
    }

}
