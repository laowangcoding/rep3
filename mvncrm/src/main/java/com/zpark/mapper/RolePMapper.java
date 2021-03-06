package com.zpark.mapper;

import com.zpark.pojo.RoleP;
import com.zpark.pojo.RolePExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePMapper {
    int countByExample(RolePExample example);

    int deleteByExample(RolePExample example);

    int insert(RoleP record);

    int insertSelective(RoleP record);

    List<RoleP> selectByExample(RolePExample example);

    int updateByExampleSelective(@Param("record") RoleP record, @Param("example") RolePExample example);

    int updateByExample(@Param("record") RoleP record, @Param("example") RolePExample example);
}