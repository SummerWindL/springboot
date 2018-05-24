package com.softetone.springboot.dao;

import com.softetone.springboot.pojo.User;

/**
 * 2018年4月28日-下午2:53:58
 * @author Administrator
 * TODO
 */
public interface UserDao {

	public int insert(User user);
	
	public int deleteById(Integer id);
	
	public int update(User user);
	
	public User getById(Integer id);
}
