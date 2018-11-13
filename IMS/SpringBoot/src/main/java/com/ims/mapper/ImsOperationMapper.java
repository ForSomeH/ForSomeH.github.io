package com.ims.mapper;

import com.ims.entity.ImsOperation;
import com.ims.entity.ImsOperationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsOperationMapper {
    int countByExample(ImsOperationExample example);

    int deleteByExample(ImsOperationExample example);

    int deleteByPrimaryKey(Integer operationNo);

    int insert(ImsOperation record);

    int insertSelective(ImsOperation record);

    List<ImsOperation> selectByExample(ImsOperationExample example);

    ImsOperation selectByPrimaryKey(Integer operationNo);

    int updateByExampleSelective(@Param("record") ImsOperation record, @Param("example") ImsOperationExample example);

    int updateByExample(@Param("record") ImsOperation record, @Param("example") ImsOperationExample example);

    int updateByPrimaryKeySelective(ImsOperation record);

    int updateByPrimaryKey(ImsOperation record);
}