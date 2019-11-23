package com.example.course_cyh.Enums;

public enum ResultEnum {
    UNKOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    USERNAME_NOT_EMPTY(101, "用户名不能为空！"),
    PASSWORD_NOT_EMPTY(102, "密码不能为空！"),
    CODE_NOT_EMPTY(103, "验证码不能为空！");

    private Integer code;

    private String msg;


    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;

    }
}

