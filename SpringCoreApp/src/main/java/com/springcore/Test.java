package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext ap=	new ClassPathXmlApplicationContext("config.xml");

	Employee emp =(Employee) ap.getBean("emp");
	System.out.println("Employee Id :" +emp.getId());
	System.out.println("Employee Name :" +emp.getName());
	
	}

}
