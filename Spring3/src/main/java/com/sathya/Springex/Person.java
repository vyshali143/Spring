package com.sathya.Springex;

public class Person {

	private String Name;
	private String EmailId;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public void personInfo()
	{
		System.out.println("Hey"+" "+Name+" "+"welcome to My World");
		System.out.println("Your email id is"+" "+EmailId+" "+"you will get updates");
		
	}
	
		
	
}
