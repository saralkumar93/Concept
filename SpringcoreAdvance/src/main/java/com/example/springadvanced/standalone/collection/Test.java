package com.example.springadvanced.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/springadvanced/standalone/collection/config.xml");
		ProductsList product =(ProductsList) context.getBean("productsList");
		System.out.println(product);
	}

}
