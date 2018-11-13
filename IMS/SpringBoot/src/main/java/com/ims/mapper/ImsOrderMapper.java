package com.ims.mapper;

import com.ims.entity.ImsOrder;
import com.ims.entity.ImsOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsOrderMapper {
    int countByExample(ImsOrderExample example);

    int deleteByExample(ImsOrderExample example);

    int deleteByPrimaryKey(Integer orderNo);

    int insert(ImsOrder record);

    int insertSelective(ImsOrder record);

    List<ImsOrder> selectByExample(ImsOrderExample example);

    ImsOrder selectByPrimaryKey(Integer orderNo);

    int updateByExampleSelective(@Param("record") ImsOrder record, @Param("example") ImsOrderExample example);

    int updateByExample(@Param("record") ImsOrder record, @Param("example") ImsOrderExample example);

    int updateByPrimaryKeySelective(ImsOrder record);

    int updateByPrimaryKey(ImsOrder record);
}