package com.softetone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018年4月24日-上午10:26:11
 * @author Administrator
 * TODO
 */
@RestController
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/hello1")
	public String hello1() {
		return "hello11";
	}
	
	/*@GetMapping("/index")
	public String index() {
		return "index";
	}*/
	
}
