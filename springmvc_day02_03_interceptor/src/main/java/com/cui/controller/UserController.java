package com.cui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *     拦截器的作用：
 *     SpringMVC的处理器拦截器类型于Servlet开发中的过滤器Filter，用于对处理器进行预处理和后处理。
 * 用户可以自己定义一些拦截器来实现特定的功能。
 *     拦截器链就是将拦截器按一定的顺序联结成一条链。在访问被拉开的方法或字段时，拦截器链中的拦截
 * 器就会按其定义的顺序被调用。
 *
 *     拦截器和过滤器的区别：
 * 1. 过滤器是servlet规范中的一部分，任何java web工程都可以使用；拦截器是SpringMVC框架自己的，只
 * 有使用了SpringMVC框架的工程才能用。
 * 2. 过滤器在url-pattern中配置了“/*”之后，可以对所有要访问的资源拦截；拦截器只会拦截访问的控制器
 * 方法，如果访问的是jsp，html，css，image或者js是不会进行拦截的。
 *
 *     拦截器是AOP思想的具体应用。
 *     通过实现HandlerInterceptor接口来自定义拦截器。
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("testInterceptor执行了.....");
        return "success";
    }
}
