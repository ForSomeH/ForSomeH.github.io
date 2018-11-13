package com.ims.mapper;

import com.ims.entity.ImsType;
import com.ims.entity.ImsTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsTypeMapper {
    int countByExample(ImsTypeExample example);

    int deleteByExample(ImsTypeExample example);

    int deleteByPrimaryKey(Integer typeCode);

    int insert(ImsType record);

    int insertSelective(ImsType record);

    List<ImsType> selectByExample(ImsTypeExample example);

    ImsType selectByPrimaryKey(Integer typeCode);

    int updateByExampleSelective(@Param("record") ImsType record, @Param("example") ImsTypeExample example);

    int updateByExample(@Param("record") ImsType record, @Param("example") ImsTypeExample example);

    int updateByPrimaryKeySelective(ImsType record);

    int updateByPrimaryKey(ImsType record);
}