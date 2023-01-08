package com.admin.mapper;

import com.admin.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface usermapper {
    @Select("select * from  sys_user")
    List<user> FindAllData();
}
