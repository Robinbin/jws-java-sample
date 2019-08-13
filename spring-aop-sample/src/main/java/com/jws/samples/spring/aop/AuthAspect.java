package com.jws.samples.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.nio.file.AccessDeniedException;

@Aspect
@Slf4j
@Component
public class AuthAspect {
    @Before("execution(* com.jws.samples.spring.aop.*Service.*(..))")
    public void before1(JoinPoint joinPoint) throws AccessDeniedException {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AuthPermission authPermission = method.getAnnotation(AuthPermission.class);

        if (authPermission != null) {
            int idx = authPermission.idx();
            Object[] args = joinPoint.getArgs();
            int userId = (int) args[idx];
            if (userId != 1) {
                throw new AccessDeniedException("您无权操作接口：" + method.getName());
            }
        }
    }
}
