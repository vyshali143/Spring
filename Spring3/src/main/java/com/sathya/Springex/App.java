package com.sathya.Springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the IOC Container
    @SuppressWarnings("resource")
	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
    //Get the beans call the method
    Person person1 = context.getBean("person1",Person.class);
        person1.personInfo();   
    System.out.println("**************");
    System.out.println(" ");
    
    Person person2= context.getBean("person2",Person.class);
    person2.personInfo();
    System.out.println("**************");
    System.out.println(" ");
      
    Person person3= context.getBean("person3",Person.class);
    person3.personInfo();
    System.out.println("**************");
    }
}
