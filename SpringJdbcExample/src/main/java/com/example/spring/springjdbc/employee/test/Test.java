package com.example.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.example.spring.springjdbc.employee.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/example/spring/springjdbc/employee/test/config.xml");
		EmployeeDaoImpl dao = (EmployeeDaoImpl) context.getBean("employeeDao");
//		Employee employee= new Employee();
//		employee.setId(2);
//		employee.setFirstName("Shubham");
//		employee.setLastName("lokhande");
		//int result =dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(1);
	  //  Employee employee = dao.read(2);
		List<Employee> result = dao.read();
		System.out.println("Employee records are :"+result);
	}
  
}
