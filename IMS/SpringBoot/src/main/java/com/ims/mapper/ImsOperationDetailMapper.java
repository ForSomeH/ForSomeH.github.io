package com.ims.mapper;

import com.ims.entity.ImsOperationDetail;
import com.ims.entity.ImsOperationDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsOperationDetailMapper {
    int countByExample(ImsOperationDetailExample example);

    int deleteByExample(ImsOperationDetailExample example);

    int deleteByPrimaryKey(Integer operationDetailNo);

    int insert(ImsOperationDetail record);

    int insertSelective(ImsOperationDetail record);

    List<ImsOperationDetail> selectByExample(ImsOperationDetailExample example);

    ImsOperationDetail selectByPrimaryKey(Integer operationDetailNo);

    int updateByExampleSelective(@Param("record") ImsOperationDetail record, @Param("example") ImsOperationDetailExample example);

    int updateByExample(@Param("record") ImsOperationDetail record, @Param("example") ImsOperationDetailExample example);

    int updateByPrimaryKeySelective(ImsOperationDetail record);

    int updateByPrimaryKey(ImsOperationDetail record);
}