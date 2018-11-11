package com.ims.mapper;

import com.ims.entity.VwOrderExtend;
import com.ims.entity.VwOrderExtendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwOrderExtendMapper {
    int countByExample(VwOrderExtendExample example);

    int deleteByExample(VwOrderExtendExample example);

    int insert(VwOrderExtend record);

    int insertSelective(VwOrderExtend record);

    List<VwOrderExtend> selectByExample(VwOrderExtendExample example);

    int updateByExampleSelective(@Param("record") VwOrderExtend record, @Param("example") VwOrderExtendExample example);

    int updateByExample(@Param("record") VwOrderExtend record, @Param("example") VwOrderExtendExample example);
}