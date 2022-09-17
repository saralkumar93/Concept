package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
	
	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/beanscope/autoconfig.xml");
	Student student=context.getBean("student",Student.class);
//	System.out.println(student);
//	System.out.println(student.getSubject());
//	System.out.println(student.getSubject().getClass().getName());
	
	//System.out.println(student.hashCode());
//	Student student2 = context.getBean("student",Student.class);
	//System.out.println(student2.hashCode());
	
	Teacher t1=context.getBean("teacher",Teacher.class);
	Teacher t2=context.getBean("teacher",Teacher.class);
	
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	
	
	}

}
