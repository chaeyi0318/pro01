package com.example.pro01.common.exception;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Method;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @Around("execution(* com.example.pro01.*.*(..))")
    public Object processRequest(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        return joinPoint.proceed();
    }
}
