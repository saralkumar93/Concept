package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/referencetype/config.xml");
		 Student student=(Student)con.getBean("student");
		System.out.println(student);
		

	}

}
