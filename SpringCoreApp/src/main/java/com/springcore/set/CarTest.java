package com.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {


		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/set/setconfig.xml");
		CarDealer car=(CarDealer)con.getBean("cardealer");
		System.out.println(car.getName());
		System.out.println(car.getModels());

	}

}
