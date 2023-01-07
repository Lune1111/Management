package com.admin.controller;

import com.admin.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/te")
public class usercontroller {

    @Autowired
    private usermapper mapper;

    @GetMapping
    public List test(){
        return mapper.FindAllData();
    }
}
