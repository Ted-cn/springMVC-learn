package com.cui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器类
 */
@Controller
public class HelloController {

    /**
     * @RequestMapping
     * 作用：用于建立请求URL和处理请求方法之间的对应关系
     * 属性：
     *     1. value，用于指定请求的URL。和path属性的作用是一样的；
     *     2. method，用于指定请求的方式；
     *     3. params，用于指定限制请求参数的条件。它支持简单的表达式。要求请求参数的
     * key和value必须和配置的一样；例如
     *         params = {"accountName"}，表示请求参数必须有accountName
     *         params = {"money!100"}，表示请求参数中money不能是100
     *     4. headers，用于指定限制请求消息头的条件
     */
    // 加不加“/”没有影响
    @RequestMapping(value = "/hello", params = "username")
    public String sayHello() {
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
