package com.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {

	public static void main(String[] args) {


		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/map/mapconfig.xml");
		Customer customer=(Customer)con.getBean("customer");
		System.out.println(customer);
		

	}

}
