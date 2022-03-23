package com.example.springadvanced.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address;

	
	public Employee(Address address) {
		
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	@Autowired//autowird use as contructor level field level and setter level
	@Qualifier("address1") // match the name in beans if we have multiple beans available
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
	
	

}
