package com.ims.mapper;

import com.ims.entity.ImsStockProduct;
import com.ims.entity.ImsStockProductExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImsStockProductMapper {
    int countByExample(ImsStockProductExample example);

    int deleteByExample(ImsStockProductExample example);

    int deleteByPrimaryKey(Integer imsStockProductId);

    int insert(ImsStockProduct record);

    int insertSelective(ImsStockProduct record);

    List<ImsStockProduct> selectByExample(ImsStockProductExample example);

    ImsStockProduct selectByPrimaryKey(Integer imsStockProductId);

    int updateByExampleSelective(@Param("record") ImsStockProduct record, @Param("example") ImsStockProductExample example);

    int updateByExample(@Param("record") ImsStockProduct record, @Param("example") ImsStockProductExample example);

    int updateByPrimaryKeySelective(ImsStockProduct record);

    int updateByPrimaryKey(ImsStockProduct record);
}