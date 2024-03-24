package com.sathya.Springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(101,"Prabha");
		return doctor;
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy = new Pharmacy("Anu","Hyderabad");
	 return pharmacy;
	}
	
	@Bean
	public Patient patient()
	{
		Patient patient = new Patient("kaju",55,doctor(),pharmacy());
		return patient;
	}
	
}

