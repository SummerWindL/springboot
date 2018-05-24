package com.softetone.springboot.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 2018年4月26日-下午3:01:55
 * @author Administrator
 * TODO
 */
public class User {

	private Integer id;
	
	private String username;
	
	private String password;
	
	@JSONField(format="yyyy-MM-dd")
	private Date birthday;

	public User() {
		
	}

	public User(Integer id, String username, String password, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
