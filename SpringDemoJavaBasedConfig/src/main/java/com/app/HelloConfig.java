package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
