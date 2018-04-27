package com.softetone.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 2018年4月26日-下午4:28:59
 * @author Administrator
 * TODO
 */
@Aspect
@Component
public class TimeAspect {

	 @Around("execution(* com.softetone.springboot.controller.FastjsonController..*(..))")
	    public Object method(ProceedingJoinPoint pjp) throws Throwable {

	        System.out.println("=====Aspect处理=======");
	        Object[] args = pjp.getArgs();
	        for (Object arg : args) {
	            System.out.println("参数为:" + arg);
	        }

	        long start = System.currentTimeMillis();

	        Object object = pjp.proceed();

	        System.out.println("Aspect 耗时:" + (System.currentTimeMillis() - start));

	        return object;
	    }
}
