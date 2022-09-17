package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.entities.Employee;
import com.springjdbc.javaconfig.JdbcConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello, welcome to Spring jdbc tutorial");

		// spring jdbc---jdbcTemplate
		ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
	  
		EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDao.class);
		//insert
	//	Employee emp= new Employee();
//		emp.setId(144);
//		emp.setName("sk");
//		emp.setCity("mumbai");
		
	//	int result = employeeDao.insert(emp);
	//	System.out.println("Employee Added..."+result);
	//update
	//Employee e= new Employee();
	//e.setId(111);
	//e.setName("Mohan");
	//e.setCity("agra");
	
	//int r= employeeDao.change(e);
	//System.out.println("data changed"+r);
		
		// delete
		//int delete = employeeDao.delete(144);
		//System.out.println("data deleted..."+delete);
		
// get single emp
//		Employee employee = employeeDao.getEmployee(124);
//		
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
//		System.out.println(employee.getCity());
		
	 // get all emp
		List<Employee> allEmployee = employeeDao.getAllEmployee();
		
		for(Employee e : allEmployee)
		{
			System.out.println();
			System.out.println(e);
		}
		
		
		
				
		
		
	}  
}
