package com.sathya.Springex;

public class Bus implements Vehicle{
	private String busType;
	private int maxSpeed;
	
	//generate getters and setters
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public void move() {
		System.out.println("Your selected bus vehicle");
		System.out.println("Max Speed...."+maxSpeed);
		System.out.println("Bus Type...."+busType);
		}
		
	}

