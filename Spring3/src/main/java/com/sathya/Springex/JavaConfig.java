package com.sathya.Springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
 
	@Bean
	public Person person1()
	{
		Person person =new Person();
		person.setName("vyshali");
		person.setEmailId("vyshu@555.com");
		return person;
	}
	
	@Bean
	public Person person2()
	{
		Person person =new Person();
		person.setName("Kanna");
		person.setEmailId("Kanna@757.com");
		return person;
	}
	
	@Bean
	public Person person3()
	{
		Person person =new Person();
		person.setName("pichi");
		person.setEmailId("pichi@123.com");
		return person;
	}
	
}
