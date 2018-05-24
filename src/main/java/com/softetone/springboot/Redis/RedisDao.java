package com.softetone.springboot.Redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 *@date 2018年5月14日-下午4:27:22
 *@author fu yanliang
 *项目名：springboot
 *文件名：RedisDao.java
 *@action(作用)
 *@instruction:实现使用RedisAPI自己实现缓存功能、消息队列或分布式锁之类的需求
 *spring data redis为我们提供RedisTemplate和StringRedisTemplate两个模板进行数据操作。
 *   方法                        	说明
	opsForValue()	操作简单属性的数据
	opsForList()	操作含有 list 的数据
	opsForSet()	           操作含有 set 的数据
	opsForZSet()	操作含有 zset 的数据
	opsForHash()	操作含有 hash 的数据
 *
 */
@Component
public class RedisDao {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	public void set(String key,String value) {
		this.stringRedisTemplate.opsForValue().set(key, value);
	}
	
	public String get(String key) {
		return this.stringRedisTemplate.opsForValue().get(key);
	}
	
	public void delete(String key) {
		this.stringRedisTemplate.delete(key);
	}
}
