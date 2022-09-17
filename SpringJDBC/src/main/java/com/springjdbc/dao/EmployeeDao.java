package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Employee;

public interface EmployeeDao {
	
	
	public int insert(Employee employee);
	
	public int change(Employee employee);
	
	public int delete(int employeeId); 
	
	public Employee getEmployee(int employeeId);
	
	public List<Employee> getAllEmployee();
	
	
	

}
