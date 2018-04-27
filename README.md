# springboot
springboot demo 

目前构建到可以实现websocket局域网通信聊天。

![image](https://github.com/SummerWindL/springboot/resources/1.png)


大概的结构就是这样，先建立springboot 的mvn项目，也可以通过http://start.spring.io/
来快速构建自己的springboot项目

pom文件如下：
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.softetone</groupId>
  <artifactId>springboot</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>war</packaging>
  
  <!-- 定义公共资源版本 -->
	<parent>
	    <groupId>org.springframework.boot</groupId>
	    <artifactId>spring-boot-starter-parent</artifactId>
	    <version>1.5.6.RELEASE</version>
	    <relativePath /> 
	</parent>
	
	<properties>
	    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	    <java.version>1.8</java.version>
	</properties>
	
	<dependencies>
	    <!-- 上边引入 parent，因此 下边无需指定版本 -->
	    <!-- 包含 mvc,aop 等jar资源 -->
	    <dependency>
	        <groupId>org.springframework.boot</groupId>
	        <artifactId>spring-boot-starter-web</artifactId>
	    </dependency>
	    
	    <!-- 热部署 -->
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-devtools</artifactId>
		    
		    <optional>true</optional>
		    <scope>true</scope>
		</dependency>
		
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-log4j2</artifactId>
		</dependency>
		
		<!-- 整合模板引擎 -->
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-freemarker</artifactId>
		</dependency>
		<!-- 整合fastjson -->
		<dependency>
		    <groupId>com.alibaba</groupId>
		    <artifactId>fastjson</artifactId>
		    <version>1.2.35</version>
		</dependency>
		<!-- AOP -->
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-aop</artifactId>
		</dependency>
		<!-- 文件上传下载工具 -->
		<dependency>
		    <groupId>commons-io</groupId>
		    <artifactId>commons-io</artifactId>
		    <version>2.4</version>
		</dependency>
		<!-- 整合websocket -->
		<dependency>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-starter-websocket</artifactId>
		</dependency>
		
	</dependencies>
	
	<build>
	    <plugins>
	        <plugin>
	            <groupId>org.springframework.boot</groupId>
	            <artifactId>spring-boot-maven-plugin</artifactId>
	            <configuration>
	                <!-- 没有该配置，devtools 不生效 -->
	                <fork>true</fork>
	            </configuration>
	        </plugin>
	    </plugins>
	</build>
	
</project>
