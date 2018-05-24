package com.softetone.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.softetone.springboot.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * 2018年4月26日-下午3:03:12
 * @author Administrator
 * TODO
 */
@Api(value = "FastJson测试",tags = {"测试接口"})
@RestController
@RequestMapping("fastjson")
public class FastjsonController {

	
	@ApiOperation("获取用户信息")
	@ApiImplicitParam(name = "name",value = "用户名",dataType = "string",paramType = "query")
	@GetMapping("/test/{name}")
	public User test(@PathVariable("name") String name) {
		User user = new User();
		
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
		
		//模拟异常
//		int i = 1/0;
		
		return user;
	}
	
	/*@RequestMapping("/test")
	@ResponseBody
	public User test() {
		User user = new User();
		
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("jack123");
		user.setBirthday(new Date());
		
		//模拟异常
//		int i = 1/0;
		
		return user;
	}*/
}
