package com.springcore.constructioninjection.ambiguity;

public class Addition {
	Addition(double a,double b)
	{
		System.out.println("inside double");
	}
	
	
	Addition(int a,int b)
	{
		System.out.println("Inside contruction Int");
	}
	
	Addition(String a,String  b)
	{
		System.out.println("Inside contruction String");
	}
	

}
