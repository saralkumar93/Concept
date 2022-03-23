package com.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		AbstractApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/lc/interfaces/config.xml");
		 Patient patient=(Patient)con.getBean("patient");
		System.out.println(patient);
		con.registerShutdownHook();
		

	}

}
