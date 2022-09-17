package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{21+43-88}")
	private int a;
	
	@Value("#{20+20}")
	private int b;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double c;
	
	@Value("#{T(java.lang.Math).PI}")
	private double x;
	
	@Value("#{new java.lang.String('amit')}")
	private String name;
	
	@Value("#{8>2}")
	private boolean isActive;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getx() {
		return x;
	}
	public void setx(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + ", x=" + x + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	
	

}
