package com.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean ,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}
	public void hi()
	{
		System.out.println("Insid hi method");
	}
	public void bye()
	{
		System.out.println("Inside Bye Method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Afterproperties Set()");
	}

	public void destroy() throws Exception {
	System.out.println("Inside the Distroy()");
		
	}
	
	
	
	

}
