package com.ims.mapper;

import com.ims.entity.ImsStock;
import com.ims.entity.ImsStockExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsStockMapper {
    int countByExample(ImsStockExample example);

    int deleteByExample(ImsStockExample example);

    int deleteByPrimaryKey(Integer stockCode);

    int insert(ImsStock record);

    int insertSelective(ImsStock record);

    List<ImsStock> selectByExample(ImsStockExample example);

    ImsStock selectByPrimaryKey(Integer stockCode);

    int updateByExampleSelective(@Param("record") ImsStock record, @Param("example") ImsStockExample example);

    int updateByExample(@Param("record") ImsStock record, @Param("example") ImsStockExample example);

    int updateByPrimaryKeySelective(ImsStock record);

    int updateByPrimaryKey(ImsStock record);
}