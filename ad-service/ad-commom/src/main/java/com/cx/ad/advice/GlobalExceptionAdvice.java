package com.cx.ad.advice;

import com.cx.ad.exception.AdException;
import com.cx.ad.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/19 17:52
 */
@RestControllerAdvice
@ControllerAdvice(basePackages = "com.cx.ad.controller")
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public R<String> handlerAdException(HttpServletRequest request, AdException ex){
        R<String> response=new R<>(-1,"business error");
        response.setData(ex.getMessage());
        return response;
    }
}
