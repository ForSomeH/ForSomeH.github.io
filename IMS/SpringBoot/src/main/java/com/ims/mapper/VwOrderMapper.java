package com.ims.mapper;

import com.ims.entity.VwOrder;
import com.ims.entity.VwOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwOrderMapper {
    int countByExample(VwOrderExample example);

    int deleteByExample(VwOrderExample example);

    int insert(VwOrder record);

    int insertSelective(VwOrder record);

    List<VwOrder> selectByExample(VwOrderExample example);

    int updateByExampleSelective(@Param("record") VwOrder record, @Param("example") VwOrderExample example);

    int updateByExample(@Param("record") VwOrder record, @Param("example") VwOrderExample example);
}