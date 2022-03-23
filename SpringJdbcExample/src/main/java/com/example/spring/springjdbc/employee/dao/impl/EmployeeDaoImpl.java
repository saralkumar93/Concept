package com.example.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.spring.springjdbc.employee.dao.EmpoyeeDao;
import com.example.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.example.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmpoyeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}
	public int update(Employee employee) {
		String sql= "update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}  
	public int delete(int id) {
		String sql= "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id );
		return result;
	}
	public Employee read(int id) {
		String sql= "select * from employee where id =?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper,id);
		return employee;
	}
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}
	
	
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

}
