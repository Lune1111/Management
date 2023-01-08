package com.admin.service;

import com.admin.pojo.user;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface usermapperIntf {
    public List<user> SelectAll();
    public boolean InsertNewUser(user User);
    public boolean UpdateUser(user User);
    public boolean DeleteDate(int Id);
}
