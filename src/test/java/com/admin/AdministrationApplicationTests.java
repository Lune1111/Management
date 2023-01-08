package com.admin;

import com.admin.mapper.usermapper;
import com.admin.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdministrationApplicationTests {

    @Autowired
    private usermapper mapper;

    @Test
    void contextLoads() {
        user User =new user();
        User.setUserName("张三");
        User.setPassword("123456");
        User.setNickName("Lune");
        User.setPhone("146932784");
        User.setEmail("155@mail.com");
        mapper.InsertNewUser(User);
        System.out.println( mapper.FindAllData());
    }

    @Test
    public void test1(){
        mapper.DeleteDate(2);
        System.out.println(mapper.FindAllData());
    }

}
