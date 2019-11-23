package com.example.course_cyh.exception;


import com.example.course_cyh.Enums.ResultEnum;

public class LoginException extends RuntimeException {
    private Integer code;

    public LoginException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public LoginException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
