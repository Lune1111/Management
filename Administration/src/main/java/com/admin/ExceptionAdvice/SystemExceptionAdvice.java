package com.admin.ExceptionAdvice;

public class SystemExceptionAdvice extends RuntimeException{
    private Integer Code;

    public SystemExceptionAdvice(Integer code) {
        Code = code;
    }

    public SystemExceptionAdvice(Integer code,String message) {
        super(message);
        Code = code;
    }

    public SystemExceptionAdvice(Integer code,String message, Throwable cause) {
        super(message, cause);
        Code = code;
    }

    public SystemExceptionAdvice(Integer code,Throwable cause) {
        super(cause);
        Code = code;
    }

    public SystemExceptionAdvice(Integer code,String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        Code = code;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }
}
