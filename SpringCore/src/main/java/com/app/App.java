package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context
//       	= new ClassPathXmlApplicationContext("/com/app/spring.xml");
    	
    	ApplicationContext context
    	 					= new AnnotationConfigApplicationContext(BeanConfig.class);
    	
//    	Doctor doctor=context.getBean(Doctor.class);
//    	Nurse n=context.getBean(Nurse.class); 
//      //  Doctor doctor=new Doctor();
//       // doctor.assist();
//    	n.assist();
    	Doctor doctor=context.getBean(Doctor.class);
    	doctor.assist();
    	doctor.setQualification("MBBS");
    	System.out.println(doctor);
    	
    	Doctor doc1=context.getBean(Doctor.class);
    	System.out.println(doc1);
    	
    	
    	
    }
}
