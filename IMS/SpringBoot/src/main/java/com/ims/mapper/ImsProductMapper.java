package com.ims.mapper;

import com.ims.entity.ImsProduct;
import com.ims.entity.ImsProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsProductMapper {
    int countByExample(ImsProductExample example);

    int deleteByExample(ImsProductExample example);

    int deleteByPrimaryKey(Integer productNo);

    int insert(ImsProduct record);

    int insertSelective(ImsProduct record);

    List<ImsProduct> selectByExample(ImsProductExample example);

    ImsProduct selectByPrimaryKey(Integer productNo);

    int updateByExampleSelective(@Param("record") ImsProduct record, @Param("example") ImsProductExample example);

    int updateByExample(@Param("record") ImsProduct record, @Param("example") ImsProductExample example);

    int updateByPrimaryKeySelective(ImsProduct record);

    int updateByPrimaryKey(ImsProduct record);
}