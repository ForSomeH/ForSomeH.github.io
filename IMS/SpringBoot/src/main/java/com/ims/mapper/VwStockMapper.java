package com.ims.mapper;

import com.ims.entity.VwStock;
import com.ims.entity.VwStockExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwStockMapper {
    int countByExample(VwStockExample example);

    int deleteByExample(VwStockExample example);

    int insert(VwStock record);

    int insertSelective(VwStock record);

    List<VwStock> selectByExample(VwStockExample example);

    int updateByExampleSelective(@Param("record") VwStock record, @Param("example") VwStockExample example);

    int updateByExample(@Param("record") VwStock record, @Param("example") VwStockExample example);
}