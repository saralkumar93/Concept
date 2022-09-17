package com.app.lifecycle;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("from init()");
	}
	public void destroy()
	{
		System.out.println("from destroy method");
	}
	
	

}
