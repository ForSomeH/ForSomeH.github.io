package com.ims.mapper;

import com.ims.entity.VwOperation;
import com.ims.entity.VwOperationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwOperationMapper {
    int countByExample(VwOperationExample example);

    int deleteByExample(VwOperationExample example);

    int insert(VwOperation record);

    int insertSelective(VwOperation record);

    List<VwOperation> selectByExample(VwOperationExample example);

    int updateByExampleSelective(@Param("record") VwOperation record, @Param("example") VwOperationExample example);

    int updateByExample(@Param("record") VwOperation record, @Param("example") VwOperationExample example);
}