package com.admin.mapper;

import com.admin.pojo.user;
import lombok.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface usermapper {
    @Select("select * from  sys_user")
    List<user> FindAllData();
    @Insert("INSERT INTO sys_user(username,password,nickname,email,phone,address,create_time) VALUES (#{UserName},#{Password},#{NickName},#{Email},#{Phone},#{Address},#{Time})")
    public boolean InsertNewUser(user User);
    @Update("update sys_user set username=#{UserName},password=#{Password},nickname=#{NickName},email=#{Email},phone=#{Phone},address=#{Address} where id=#{Id}")
    public boolean UpdateUser(user User);
    @Delete("delete from sys_user where id=#{id}")
    public boolean DeleteDate(@Param("id")int Id);
}
