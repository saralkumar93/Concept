package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
	
	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/stereotype/autoconfig.xml");
	Student student=context.getBean("student",Student.class);
	System.out.println(student);
	System.out.println(student.getSubject());
	System.out.println(student.getSubject().getClass().getName());
	
	
	}

}
