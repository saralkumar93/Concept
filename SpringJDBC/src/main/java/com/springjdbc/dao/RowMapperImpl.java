package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp= new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setCity(rs.getString(3));
		
		return emp;
	}
	
	

}
