package com.softetone.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.softetone.springboot.entity.User;

/**
 * 2018年4月26日-下午3:03:12
 * @author Administrator
 * TODO
 */
@Controller
@RequestMapping("fastjson")
public class FastjsonController {

	@RequestMapping("/test")
	@ResponseBody
	public User test() {
		User user = new User();
		
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
		
		//模拟异常
		int i = 1/0;
		
		return user;
	}
}
