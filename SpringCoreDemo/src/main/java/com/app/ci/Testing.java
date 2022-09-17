package com.app.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Testing 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Spring Core Examples" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/app/ci/ciconfig.xml");
        Person p= (Person) context.getBean("p1");
        System.out.println(p);
    }
}
