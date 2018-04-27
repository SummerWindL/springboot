package com.softetone.springboot;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import com.softetone.springboot.filter.TimeFilter;
import com.softetone.springboot.listener.ListenerTest;
import com.softetone.springboot.servlet.ServletTest;

/**
 * 2018年4月26日-下午3:43:55
 * @author Administrator
 * TODO
 * 另外一种实现：针对自定义 Servlet、Filter 和 Listener 的配置
 */
public class SpringbootWebApplication implements ServletContextInitializer{
	
	@Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 配置 Servlet
        servletContext.addServlet("servletTest",new ServletTest())
                      .addMapping("/servletTest");
        // 配置过滤器
        servletContext.addFilter("timeFilter",new TimeFilter())
                      .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
        // 配置监听器
        servletContext.addListener(new ListenerTest());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
}
