package com.softetone.springboot.test;

import java.util.Arrays;
import java.util.List;

/**
 * 2018年4月27日-下午3:13:26
 * @author Administrator
 * TODO lambda表达式
 */
public class Test {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start();
		
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		
		
		// Java 8之前：
		/*List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
		    System.out.println(feature);
		}*/
		
		
		// Java 8之后：
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
		 
		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
		// 看起来像C++的作用域解析运算符
//		features.forEach(System.out::println);
		
		
	}
	
	
}
