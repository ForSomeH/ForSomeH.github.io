package com.ims.mapper;

import com.ims.entity.VwProduct;
import com.ims.entity.VwProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwProductMapper {
    int countByExample(VwProductExample example);

    int deleteByExample(VwProductExample example);

    int insert(VwProduct record);

    int insertSelective(VwProduct record);

    List<VwProduct> selectByExample(VwProductExample example);

    int updateByExampleSelective(@Param("record") VwProduct record, @Param("example") VwProductExample example);

    int updateByExample(@Param("record") VwProduct record, @Param("example") VwProductExample example);
}