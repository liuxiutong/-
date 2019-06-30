package com.itlanma.aop;

import com.itlanma.domain.Log;
import com.itlanma.domain.User;
import com.itlanma.service.AopService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component("myAspect")
@Aspect
public class MyAspect {
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private AopService aopService;
    @Around(value = "execution(* com.itlanma.controller.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进来了..........");
        //获取当前时间
        Date time = new Date();
        //获取当前请求地址
        StringBuffer requestURL = request.getRequestURL();
        //方法执行前
        long start = System.currentTimeMillis();
        //执行目标方法
        Object[] args = pjp.getArgs();
        //返回值为实际方法的返回值
        Object proceed = pjp.proceed(args);
        //获取当前用户
        User user = (User) request.getSession().getAttribute("user");
        String name = user.getName();
        long end = System.currentTimeMillis();
        int cost = (int) (end - start);
        Log log = new Log();
        log.setName(name);
        log.setTime(time);
        log.setUrl(requestURL.toString());
        log.setCost(cost);
        aopService.insertLog(log);
        return proceed;
    }
}
