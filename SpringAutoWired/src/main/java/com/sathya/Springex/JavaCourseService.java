package com.sathya.Springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService {
	
	public void courseinfo() {
		System.out.println("Java  Full Stack Course");
		
	}
	public JavaCourseService()
	{
		System.out.println("Java Course Service:: object created");
	}

}
