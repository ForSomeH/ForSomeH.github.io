package com.ims.mapper;

import com.ims.entity.ImsOrderExtend;
import com.ims.entity.ImsOrderExtendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ImsOrderExtendMapper {
    int countByExample(ImsOrderExtendExample example);

    int deleteByExample(ImsOrderExtendExample example);

    int deleteByPrimaryKey(Integer orderExtendNo);

    int insert(ImsOrderExtend record);

    int insertSelective(ImsOrderExtend record);

    List<ImsOrderExtend> selectByExample(ImsOrderExtendExample example);

    ImsOrderExtend selectByPrimaryKey(Integer orderExtendNo);

    int updateByExampleSelective(@Param("record") ImsOrderExtend record, @Param("example") ImsOrderExtendExample example);

    int updateByExample(@Param("record") ImsOrderExtend record, @Param("example") ImsOrderExtendExample example);

    int updateByPrimaryKeySelective(ImsOrderExtend record);

    int updateByPrimaryKey(ImsOrderExtend record);
}