package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("add")
	private Address address;

	public Address getAddress() {
		return address;
	}
    
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	public Emp() {
		super();
		
	}
	//@Autowired
	public Emp(Address address) {
		super();
		this.address=address;
		System.out.println("inside contstuctor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	

	
	
	

}
