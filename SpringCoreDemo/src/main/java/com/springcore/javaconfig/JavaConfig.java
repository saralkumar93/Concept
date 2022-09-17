package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Student getStudent()
	{
		
		Student student= new Student();
		
		return student;
	}
	

}
