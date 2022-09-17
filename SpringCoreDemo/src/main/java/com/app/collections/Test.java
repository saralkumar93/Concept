package com.app.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.collections.Emp;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/collections/collectionconfig.xml");
	Emp e1=(Emp) context.getBean("emp1");
	System.out.println(e1.getName());
	System.out.println(e1.getPhones());
	System.out.println(e1.getAddresses());
	System.out.println(e1.getCourses());
	}

}
