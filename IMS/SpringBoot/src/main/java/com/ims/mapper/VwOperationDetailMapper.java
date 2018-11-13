package com.ims.mapper;

import com.ims.entity.VwOperationDetail;
import com.ims.entity.VwOperationDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VwOperationDetailMapper {
    int countByExample(VwOperationDetailExample example);

    int deleteByExample(VwOperationDetailExample example);

    int insert(VwOperationDetail record);

    int insertSelective(VwOperationDetail record);

    List<VwOperationDetail> selectByExample(VwOperationDetailExample example);

    int updateByExampleSelective(@Param("record") VwOperationDetail record, @Param("example") VwOperationDetailExample example);

    int updateByExample(@Param("record") VwOperationDetail record, @Param("example") VwOperationDetailExample example);
}