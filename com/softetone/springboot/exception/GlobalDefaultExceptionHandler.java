package com.softetone.springboot.exception;
/**
 * 2018年4月26日-下午4:36:58
 * @author Administrator
 * TODO:全局异常捕获
 */

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	/**
	 * 处理Exception 类型的异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> defaultExceptionHandler(Exception e) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("code", 500);
		map.put("msg", e.getMessage());
		return map;
	}
}
