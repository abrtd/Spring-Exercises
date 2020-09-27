package com.helen.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExApp01 {

	public static void main(String[] args) {
		// bean factory
		ApplicationContext context = new ClassPathXmlApplicationContext("com/helen/ex01/Beans.xml");
		
		// 跟工廠拿物件
		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println(hello.getMessage());
	}

}
