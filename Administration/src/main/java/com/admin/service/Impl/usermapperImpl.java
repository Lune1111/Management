package com.admin.service.Impl;

import com.admin.ExceptionAdvice.SystemExceptionAdvice;
import com.admin.controller.Code;
import com.admin.mapper.usermapper;
import com.admin.pojo.user;
import com.admin.service.usermapperIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.SyncFailedException;
import java.util.List;
@Service
public class usermapperImpl implements usermapperIntf {
    @Autowired
    private usermapper mapper;
    @Override
    public List<user> SelectAll() {
        try{
            return mapper.FindAllData();
        }catch(ArithmeticException ex){
            throw new SystemExceptionAdvice(Code.SystemException);
        }
    }

    @Override
    public boolean InsertNewUser(user User) {
       try{
           mapper.InsertNewUser(User);
           System.out.println("插入成功");
           return true;
       }catch(ArithmeticException ex){
           throw new SystemExceptionAdvice(Code.SystemException,"添加数据出错");
       }
    }

    @Override
    public boolean UpdateUser(user User) {
        try{
            if(User !=null){
                mapper.UpdateUser(User);
                return true;
            }else{
                return false;
            }
        }catch(ArithmeticException ex){
            throw new SystemExceptionAdvice(Code.SystemException,"修改数据出错");
        }
    }

    @Override
    public boolean DeleteDate(int Id) {
       try{
           mapper.DeleteDate(Id);
           return true;
       }catch (ArithmeticException ex ){
           throw new SystemExceptionAdvice(Code.SystemException);
       }
    }
}
