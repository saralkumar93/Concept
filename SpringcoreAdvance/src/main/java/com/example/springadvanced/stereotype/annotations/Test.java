package com.example.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/springadvanced/stereotype/annotations/config.xml");
		Instructor test =(Instructor) context.getBean("inst");
		System.out.println(test);
		
		
		Instructor test1 =(Instructor) context.getBean("inst");
		System.out.println(test1);
	}

}
