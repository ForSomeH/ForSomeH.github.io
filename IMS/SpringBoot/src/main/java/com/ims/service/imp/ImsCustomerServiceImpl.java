package com.ims.service.imp;

import com.ims.entity.ImsCustomer;
import com.ims.entity.ImsCustomerExample;
import com.ims.entity.ImsTypeExample;
import com.ims.mapper.ImsCustomerMapper;
import com.ims.mapper.ImsTypeMapper;
import com.ims.service.ImsCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author asus
 */
@Service
public class ImsCustomerServiceImpl implements ImsCustomerService {
    @Resource
    private ImsCustomerMapper imsCustomerMapper;
    @Autowired
    CommonMethod commonMethod;

    /**
     * 新增函数
     *
     * @param imsCustomer
     * @return
     */
    @Override
    public int saveCustomer(ImsCustomer imsCustomer) {
        imsCustomer.setCreater(commonMethod.getUser());
        imsCustomer.setCrateTime(commonMethod.getDate());
        imsCustomer.setIsDeleted("N");
        return imsCustomerMapper.insert(imsCustomer);
    }

    /**
     * 查询函数
     *
     * @param type
     * @return
     */
    @Override
    public List<ImsCustomer> getAllCustomer(String type) {
        ImsCustomerExample imsCustomerExample = new ImsCustomerExample();
        imsCustomerExample.createCriteria().andIsDeletedEqualTo("N").andCustomerTypeEqualTo(type);
        return imsCustomerMapper.selectByExample(imsCustomerExample);
    }

    /**
     * 删除函数
     *
     * @param imsCustomer
     * @return
     */
    @Override
    public int deleteCustomer(ImsCustomer imsCustomer) {
        ImsCustomer customer = imsCustomerMapper.selectByPrimaryKey(imsCustomer.getCustomerCode());
        customer.setLastModifier(commonMethod.getUser());
        customer.setLastModifyerTime(commonMethod.getDate());
        customer.setIsDeleted("Y");
        return imsCustomerMapper.updateByPrimaryKey(customer);
    }

    /**
     * 编辑函数
     *
     * @param imsCustomer
     * @return
     */
    @Override
    public int updateCustomer(ImsCustomer imsCustomer) {
        ImsCustomer customer = imsCustomerMapper.selectByPrimaryKey(imsCustomer.getCustomerCode());
        imsCustomer.setLastModifier(commonMethod.getUser());
        imsCustomer.setLastModifyerTime(commonMethod.getDate());
        imsCustomer.setCreater(customer.getCreater());
        imsCustomer.setCrateTime(customer.getCrateTime());
        imsCustomer.setCustomerType(customer.getCustomerType());
        imsCustomer.setIsDeleted("N");
        return imsCustomerMapper.updateByPrimaryKey(imsCustomer);

    }


}
