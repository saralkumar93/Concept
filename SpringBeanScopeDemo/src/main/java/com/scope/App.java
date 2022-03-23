package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Bean Scope Demo App!" );
        
        ApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
     
        con.getBean("empBean",Employee.class);
//        if(con.getBean("empBean",Employee.class)==con.getBean("employeeBean",Employee.class))
//           System.out.println("true");
//        else
//        	System.out.println("false");
//      //  System.out.println("hiiiii");
     
        
        //Employee e1 = con.getBean("empBean",Employee.class);
//         e1.st="hello";
//         
//         System.out.println(e1.st);
//         System.out.println(e1.hashCode());
//         
//         Employee e2 = con.getBean("empBean",Employee.class);
//         System.out.println(e2.st);
//         System.out.println(e2.hashCode());
    
    
    
    
    }
}
