package com.sathya.Springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	private EmailService emailService ;
	@Autowired
	private JavaCourseService   javaCourseService;

	/*1.public Student(EmailService emailService, JavaCourseService javaCourseService) {
		super();
		this.emailService = emailService;
		this.javaCourseService = javaCourseService;
	}*/
public void details()
{
	emailService.message();
	javaCourseService.courseinfo();
}
	/*2.public EmailService getEmailService() {
		return emailService;
	}
@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}
@Autowired
	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}*/
	
}
