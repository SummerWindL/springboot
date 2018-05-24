package com.softetone.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.softetone.springboot.Redis.RedisDao;

/**
 *@date 2018年5月14日-下午4:32:54
 *@author fu yanliang
 *项目名：springboot
 *文件名：RedisDaoTest.java
 *@action(作用)
 *@instruction
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

	@Autowired
	private RedisDao redosDao;
	
	@Test
	public void testSet() {
		String key = "name";
		String value = "zhangsan";
		
		this.redosDao.set(key, value);
	}
	
	@Test
	public void testGet() {
		String key = "name";
		String value = this.redosDao.get(key);
		System.out.println(value);
	}
	
	@Test
	public void testDelete() {
		String key = "name";
		this.redosDao.delete(key);
	}
}
