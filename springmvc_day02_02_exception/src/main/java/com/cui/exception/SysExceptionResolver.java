package com.cui.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        SysException sysException;
        if(ex instanceof SysException) {
            sysException = (SysException) ex;
        } else {
            sysException = new SysException("服务器正在维护中！");
        }

        mv.addObject("errorMessage", sysException.getErrorMessage());
        mv.setViewName("error");
        return mv;
    }
}
