package com.cui.controller;

import com.cui.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {
    /**
     * 作用：用请求中指定名称的参数给控制器中的形参赋值。
     * 属性：
     *    1. value，请求参数中的名称（同name）；
     *    2. required，请求参数中是否必须提供此参数，默认为true。
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("username=" + username);
        return "success";
    }

    /**
     * 作用：获取请求体内容，直接使用得到是key=value&key=value...结构的数据。get请求方式不适用。
     * 属性：
     *     1. required，是否必须有请求体。默认为true。当取值为true时，get请求方式会报错；当取值
     * 为false时，get请求得到的是null。
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("user=" + body);
        return "success";
    }

    /**
     * 作用：
     *    绑定url中的占位符。例如请求url中/delete/{id}，这个{id}就是url占位符。url支持占位符
     * 是spring3.0之后加入的，是SpringMVC支持restful风格URL的一个重要标志。
     * 属性：
     *     1. value，用于指定url中的占位符名称；
     *     2. required，是否必须提供占位符。
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id") String id) {
        System.out.println("id = " + id);
        return "success";
    }

    /**
     * 作用：
     *     用于获取请求消息头
     * 属性：
     *     1. value，提供消息头名称
     *     2. required，是否必须有此消息头
     * 注：在实际开发中一般不用
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("header = " + header);
        return "success";
    }

    /**
     * 作用：用于把指定cookie名称的值传入控制器方法参数
     * 属性：
     *     1. value，指定cookie的名称；
     *     2. required，是否必须有此cookie。
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("cookieValue = " + cookieValue);
        return "success";
    }

    /**
     * 作用：该注解是SpringMVC4.3版本以后新加入的。它可以用于修饰方法和参数。
     *     1. 出现在方法上是，表示当前方法会在控制器的方法执行之前执行。它可以修饰没有返回值方
     * 法，也可以修饰有具体返回值的方法；
     *     2. 出现在参数上时，获取指定的数据给参数赋值。
     * 属性：
     *     1. value，用于获取数据的key。key可以是POJO的属性名称，也可以是map结构的key。
     * 应用场景：
     *     当表单提交数据不是完整的实体类数据时，保证没有提交数据的字段使用数据库对象原来的数据。
     * 例如：我们在编辑一个用户时，用户有一个创建信息字段，该字段的值是不允许被修改的。在提交表
     * 单数据时肯定没有此字段的内容，一旦更新会把该字段内容置为null，此时就可以使用此注解解决问
     * 题。
     */
    @ModelAttribute
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute() {
        System.out.println();
        return "success";
    }
}
