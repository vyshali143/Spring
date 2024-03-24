package com.sathya.Springex;

public class JavaCourseService implements CourseService
{

	@Override
	public void courseinfo() {
		System.out.println("Java  Full Stack Course");
		
	}
	public JavaCourseService()
	{
		System.out.println("Java Course Service:: object created");
	}

}
