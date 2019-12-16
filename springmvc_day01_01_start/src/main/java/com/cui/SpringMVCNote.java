package com.cui;

/**
 * SpringMVC是什么？
 *     SpringMVC是一种基于Java的实现MVC设计模型的请求驱动类型的轻量级Web框架，
 * 属于SpringFrameWork的后续产品，已经整合在Spring Web Flow里面。Spring框架
 * 提供了构建Web应用程序的全功能MVC模块。使用Spring可插入的MVC架构，从而在使用
 * Spring进行Web开发时，可以选择Spring的SpringMVC框架械集成其他MVC开发框架。
 *     SpringMVC已经成为目前最主流的MVC框架之一，并且随着Spring3.0的发布，全面
 * 超越Struts2，成为最优秀的MVC框架。
 *     它通过一套注解，让一个简单的Java类成为处理请求的控制器，而无须实现接口。
 * 同时它还支持RESTful编程风格的请求。
 */

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC的优势：
 * 1. 清晰的角色划分；
 *     1）前端控制器（DispatcherServlet）：用户请求到达前端控制器，它就相当于mvc模式中的c，dispatcherServlet是
 * 整个流程控制的中心，由它调用其它组件处理用户的语法，dispatcherServlet的存在降低了组件之间的耦合性。
 *     2）处理器映射器 （HandlerMapping）：负责根据用户请求找到找到Handler即处理器，SpringMVC提供了不同的映射器
 * 实现不同的映射方式，例如：配置文件方式，实现接口方式，注解方式等。
 *     处理器（Handler）：具体业务控制器。由DispatcherServlet把用户请求转发到Handler。由Handler对具体的用户
 * 请求进行处理。
 *     3）处理器适配器（HandlerAdapter）：通过HandlerAdapter执行Handler，这是适配器模式的应用，通过扩展适配器可
 * 以对更多类型的处理器进行执行。
 *     4）视图解析器（ViewResolver）：负责将处理结果生成View视图，View Resolver首先根据逻辑视图名解析成物理视图
 * 名，即具体的页面地址，再生成View视图对象，最后对View进行渲染将处理结果通过页面展示给用户。
 *     视图（View）：SpringMVC框架提供了很多的View视图类型的支持，包括：jstlView、freemarkerView、pdfView等。
 * 最常用的就是jsp。
 *     5）处理器或页面控制器（Controller）
 *     6）验证器（Validator）
 *     7）命令对象（Command 请求参数绑定到的对象就叫命令对象）
 *     8）表单对象（Form Object 提供给表彰展示和提交到的对象就叫表单对象）
 * 2. 分工明确，扩展点相当灵活；
 * 3. 由于命令对象就是一个POJO，无需继承框架特定API，可以使用命令对象直接作为业务对象；
 * 4. 和Spring其他框架无缝集成，是其它Web框架所不具备的；
 * 5. 可适配，通过HandlerAdapter可以支持任意的类作为处理器；
 * 6. 可定制性，HandlerAdapter可以支持任意的类作为处理器；
 * 7. 功能强大的数据验证，格式化，绑定机制。
 */
@RequestMapping
public class SpringMVCNote {
}





















