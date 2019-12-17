package com.cui.controller;

import com.cui.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString执行了...");
        User user = new User("美美", "123", 20);
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了...");
        // 转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        // 重定向
        //response.sendRedirect(request.getContextPath() + "/index.jsp");
        // 直接进行响应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("你好！");
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(ModelAndView mv) {
        System.out.println("testModelAndView 执行了...");
        User user = new User("美美", "123", 20);
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        System.out.println("testForwardOrRedirect 执行了...");
        // 转发
        //return "forward:/WEB-INF/pages/success.jsp";
        // 重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求响应，此时需要使用 @RequestBody
     * @param user
     * @return
     */
    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(@RequestBody User user) {
        System.out.println("testAjax 执行了...");
        // 客户端发送ajax请求，传的是json字符串，后端封装pojo，需要jackson依赖
        System.out.println("user = " + user);
        user.setPassword("456");
        return user;
    }
}

