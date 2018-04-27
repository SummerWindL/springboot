package com.softetone.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2018年4月27日-上午8:45:44
 * @author Administrator
 * TODO
 */
@Controller
@RequestMapping("indexController")
//@RestController
public class IndexController {

	/**
	 * 跳转到index页面
	 * 
	 */
	@RequestMapping("/index")
	public String toIndex() {
		return "index";
	}
}
