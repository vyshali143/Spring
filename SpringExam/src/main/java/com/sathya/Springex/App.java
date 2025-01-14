package com.sathya.Springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the Spring IOC container
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Get the bean
		Patient patient = context.getBean("patient",Patient.class);
		patient.details();
    }
}
