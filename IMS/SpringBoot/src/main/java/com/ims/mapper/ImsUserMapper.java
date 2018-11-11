package com.ims.mapper;

import com.ims.entity.ImsUser;
import com.ims.entity.ImsUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface ImsUserMapper {
    int countByExample(ImsUserExample example);

    int deleteByExample(ImsUserExample example);

    int deleteByPrimaryKey(Integer userCode);

    int insert(ImsUser record);

    int insertSelective(ImsUser record);

    List<ImsUser> selectByExample(ImsUserExample example);

    ImsUser selectByPrimaryKey(Integer userCode);

    int updateByExampleSelective(@Param("record") ImsUser record, @Param("example") ImsUserExample example);

    int updateByExample(@Param("record") ImsUser record, @Param("example") ImsUserExample example);

    int updateByPrimaryKeySelective(ImsUser record);

    int updateByPrimaryKey(ImsUser record);
}