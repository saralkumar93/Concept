package com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Lazy
	//@Scope(scopeName = "prototype")
	public Employee empBean() {
		
		return new Employee();
	}
	
//	@Bean
//	//@Scope(scopeName = "prototype")
//	public Employee employeeBean() {
//		
//		return new Employee();
//	}
	
	

}
