package com.softetone.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 2018年4月26日-下午3:48:01
 * @author Administrator
 * TODO ：自定义拦截器
 * @Component:让spring管理其生命周期
 */
//@Component
public class TimeInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("=====afterCompletion=====");
		Long start  = (Long) request.getAttribute("startTime");
		System.out.println("耗时："+(System.currentTimeMillis()-start));
		System.out.println(arg3);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("========postHandle=========");
        Long start = (Long) request.getAttribute("startTime");
        System.out.println("耗时:"+(System.currentTimeMillis() - start));
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object handler) throws Exception {
		
		System.out.println("=====preHandle====");
		System.out.println(((HandlerMethod)handler).getBean().getClass().getName());
		System.out.println(((HandlerMethod)handler).getMethod().getName());
		
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}

	
}
