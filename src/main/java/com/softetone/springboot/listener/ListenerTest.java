package com.softetone.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.stereotype.Component;

/**
 * 2018年4月26日-下午3:33:26
 * @author Administrator
 * TODO
 */
@Component
public class ListenerTest implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("#######初始化监听器#########");
	}

}
