package com.ims.service;

import com.ims.entity.ImsCustomer;

import java.util.List;

public interface ImsCustomerService {


    /**
     * 新增函数
     *
     * @param imsCustomer
     * @return
     */
    int saveCustomer(ImsCustomer imsCustomer);

    /**
     * 查询函数
     *
     * @param type
     * @return
     */
    List<ImsCustomer> getAllCustomer(String type);


    /**
     * 删除函数
     * @param imsCustomer
     * @return
     */
    int deleteCustomer(ImsCustomer imsCustomer);

    /**
     * 编辑函数
     * @param imsCustomer
     * @return
     */
    int updateCustomer(ImsCustomer imsCustomer);
}
