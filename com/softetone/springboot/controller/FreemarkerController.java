package com.softetone.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2018年4月26日-下午2:49:41
 * @author Administrator
 * TODO
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

	@RequestMapping("hello")
	public String hello(Map<String,Object> map) {
		
		map.put("msg", "hello freemarker");
		return "hello";
	}
	
	@RequestMapping("index")
	public String index(Map<String,Object> map) {
		
//		map.put("msg", "hello freemarker");
		return "index";
	}
}
