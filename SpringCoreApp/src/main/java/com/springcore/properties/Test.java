package com.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/properties/config.xml");
		CountriesAndLanguage contryAndLangs=(CountriesAndLanguage)con.getBean("countryAndLangs");
		System.out.println(contryAndLangs);
		

	}

}
