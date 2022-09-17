package com.app.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
	public static void main(String[] args) {
		
	
	
	 AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/app/lifecycle/config.xml");
	 context.registerShutdownHook();
    
	 //Samosa samosa =(Samosa) context.getBean("s1");
     //System.out.println(samosa);
    
     
    // Pepsi p =(Pepsi) context.getBean("p1");
    // System.out.println(p);
	 
	 Example example=(Example)context.getBean("example");
	 System.out.println(example);
	
	
	}

}
