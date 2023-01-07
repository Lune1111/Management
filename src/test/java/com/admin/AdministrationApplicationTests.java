package com.admin;

import com.admin.mapper.usermapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdministrationApplicationTests {

    @Autowired
    private usermapper mapper;

    @Test
    void contextLoads() {
        System.out.println( mapper.FindAllData());
    }

}
