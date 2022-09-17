package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Employee employee) {
	//insert query
	String query= "insert into employee(id,name,city) values(?,?,?)";
	int r = this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getCity());
		
		return r ;
	}

	public int change(Employee employee) {
		//update
		String query="update employee set name=?, city=? where id=?";
	int r=	this.jdbcTemplate.update(query,employee.getName(),employee.getCity(),employee.getId());
		
		return r;
	}
	
	
	public int delete(int employeeId) {
		//delete
		String query= "delete from employee where id=?";
		 int d=this.jdbcTemplate.update(query,employeeId);
		return d;
	}
	
	public Employee getEmployee(int employeeId) {
		String query= "select * from employee where id=? ";
		
		RowMapper<Employee> rowMapper= new RowMapperImpl();
		
		Employee emp = this.jdbcTemplate.queryForObject(query,rowMapper,employeeId);
		
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		// selecting multiple emp
		String query="select * from Employee";
		List<Employee> list = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return list;
	}
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	












	
	
	

}
