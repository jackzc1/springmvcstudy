package com.soft.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2020/2/13.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {

        MyExcepetion myExcepetion = null;
        if (o instanceof MyExcepetion) {
            myExcepetion = (MyExcepetion) o;
        } else {
            myExcepetion = new MyExcepetion("运行时异常");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("message", myExcepetion);

        return modelAndView;
    }
}
