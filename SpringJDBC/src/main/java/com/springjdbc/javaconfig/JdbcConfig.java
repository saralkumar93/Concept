package com.springjdbc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dao.EmployeeDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.springjdbc.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
		
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		
		return jdbcTemplate;
		
	}
	/*@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		
		EmployeeDaoImpl dao= new EmployeeDaoImpl();
	dao.setJdbcTemplate(getTemplate());
	
	return dao;}*/
		
		
		
	
	

}
