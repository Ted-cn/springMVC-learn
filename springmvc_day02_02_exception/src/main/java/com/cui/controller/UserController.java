package com.cui.controller;

import com.cui.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1. 编写自定义的异常类（做提示信息的）
 * 2. 编写异常处理器
 * 3. 配置异常处理器（跳转到提示页面）
 */
@Controller
@RequestMapping("/user")
@ControllerAdvice
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("执行testException...");
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("查询用户数据失败！");
        }
        return "success";
    }
}
