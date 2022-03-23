package com.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/dependencycheck/config.xml");
		 Prescription prescription=(Prescription)con.getBean("prescription");
		System.out.println(prescription);
		
		
		
		

	}

}
