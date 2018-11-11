package com.ims.mapper;

import com.ims.entity.ImsCustomer;
import com.ims.entity.ImsCustomerExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImsCustomerMapper {
    int countByExample(ImsCustomerExample example);

    int deleteByExample(ImsCustomerExample example);

    int deleteByPrimaryKey(Integer customerCode);

    int insert(ImsCustomer record);

    int insertSelective(ImsCustomer record);

    List<ImsCustomer> selectByExample(ImsCustomerExample example);

    ImsCustomer selectByPrimaryKey(Integer customerCode);

    int updateByExampleSelective(@Param("record") ImsCustomer record, @Param("example") ImsCustomerExample example);

    int updateByExample(@Param("record") ImsCustomer record, @Param("example") ImsCustomerExample example);

    int updateByPrimaryKeySelective(ImsCustomer record);

    int updateByPrimaryKey(ImsCustomer record);
}