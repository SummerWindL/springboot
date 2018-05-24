package com.softetone.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
/**
 * 2018年4月24日-上午10:22:26
 * @author Administrator
 * TODO :
 * 该注解指定项目为springboot，由此类当作程序入口
 	自动装配 web 依赖的环境
 */
@EnableCaching
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
