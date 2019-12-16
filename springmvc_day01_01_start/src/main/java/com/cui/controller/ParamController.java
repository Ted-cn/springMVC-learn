package com.cui.controller;

import com.cui.domain.Account;
import com.cui.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定入门
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到JavaBean类中
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("account=" + account);
        return "success";
    }

    /**
     * 日期格式化
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println("user=" + user);
        return "success";
    }
}
