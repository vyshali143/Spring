package com.sathya.Springex;

public class Traveller {
 
	private String Name;
	private String Email;
	private Long MobileNumber;
	private Vehicle vehicle;
	//generate getters and setters	
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public Long getMobileNumber() {
		return this.MobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.MobileNumber = mobileNumber;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void StartJourney()
	{
		System.out.println("Hey"+" "+Name+" "+"Welcome to Travel World...");
		System.out.println("check your mobile"+" "+MobileNumber+" "+"email id"+" "+Email);
		vehicle.move();
		
	}


	
}
	