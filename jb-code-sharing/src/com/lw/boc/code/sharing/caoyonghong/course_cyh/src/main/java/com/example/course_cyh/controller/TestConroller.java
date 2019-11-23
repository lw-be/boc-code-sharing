package com.example.course_cyh.controller;

import com.example.TestCopy;
import com.example.course_cyh.Demo;
import com.example.course_cyh.Enums.ResultEnum;
import com.example.course_cyh.bean.Result;
import com.example.course_cyh.exception.LoginException;
import com.example.course_cyh.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.Map;

import static com.example.course_cyh.Demo.isValidIDCardNo;

@RestController
@RequestMapping("/test")
public class TestConroller {
    private static final Logger logger = LoggerFactory.getLogger(TestConroller.class);

    @GetMapping("/getList")
    public void getList(String name) {
        name.split(" ");
    }

    @GetMapping("/errorTest")
    public Result errorTest(String name) {
        try {
            name.split(" ");
        } catch (Exception e) {
            Result result = new Result<>();
            result.setCode(-1);
            result.setMsg(e.getMessage());
            return result;
        }
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData("{}");
        return result;
    }

    @GetMapping("/errorTest1")
    public Result errorTest1(String name) {
        try {
            name.split(" ");
        } catch (Exception e) {
            return ResultUtil.error(-1, e.getMessage());
        }
        return ResultUtil.success();
    }

    @PostMapping("/login")
    public void login(@RequestBody Map<String, String> requestMap) {
        if (StringUtils.isEmpty(requestMap.get("username"))) {
            throw new LoginException(101, "用户名不能为空！");
        }
        if (StringUtils.isEmpty(requestMap.get("password"))) {
            throw new LoginException(102, "密码不能为空！");
        }
        if (StringUtils.isEmpty(requestMap.get("code"))) {
            throw new LoginException(103, "验证码不能为空！");
        }
    }

    @PostMapping("/login1")
    public void login1(@RequestBody Map<String, String> requestMap) {
        if (StringUtils.isEmpty(requestMap.get("username"))) {
            throw new LoginException(ResultEnum.USERNAME_NOT_EMPTY);
        }
        if (StringUtils.isEmpty(requestMap.get("password"))) {
            throw new LoginException(ResultEnum.PASSWORD_NOT_EMPTY);
        }
        if (StringUtils.isEmpty(requestMap.get("code"))) {
            throw new LoginException(ResultEnum.CODE_NOT_EMPTY);
        }
    }

    @GetMapping("fileCopy")
    public void fileCopy() {
        File file = new File("d:/src1.txt");
        File targetFile = new File("d:/targetFile.txt");
        File targetFile1 = new File("d:/targetFile1.txt");
        new Thread(new Runnable() {
            @Override
            public void run() {
                TestCopy.copy(file, targetFile);
            }
        }).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                TestCopy.copyByJava7(file, targetFile1);
            }
        }).start();

    }

    @GetMapping("/lastDemo")
    public boolean lastDemo(String idCard) {
        return Demo.isValidIDCardNo(idCard);
    }

    @GetMapping("/lastDemo1")
    public Object lastDemo1(String filePath) {

        File file = new File(filePath);

        try (FileReader fReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fReader)) {
            return Demo.getValidIDCardNo(reader);
        } catch (Exception e) {
            System.out.println("error happen");
            return null;
        }
    }

    @GetMapping("/lastDemo2")
    public Object lastDemo2(String filePath) {

        File file = new File(filePath);

        try (FileReader fReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fReader)) {
            return ResultUtil.success(Demo.getValidIDCardNo(reader));
        } catch (FileNotFoundException e) {
            System.out.println("error happen");
            return ResultUtil.error(-3, "文件不存在");
        } catch (LoginException e) {
            return ResultUtil.error(-4, "文件内容不合法");
        } catch (Exception e) {
            return ResultUtil.error(-5, "系统错误");
        }
    }

    @GetMapping("/lastDemo3")
    public Object lastDemo3(String filePath) throws Exception{

        File file = new File(filePath);

        try (FileReader fReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fReader)) {
            return ResultUtil.success(Demo.getValidIDCardNo(reader));
        }
    }
}
