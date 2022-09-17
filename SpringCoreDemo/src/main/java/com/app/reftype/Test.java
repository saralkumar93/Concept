package com.app.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.collections.Emp;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/reftype/reftypeconfig.xml");
	A temp=(A) context.getBean("aref");
	System.out.println(temp.getX());
	System.out.println(temp.getOb().getY());

	}

}
