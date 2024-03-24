package com.sathya.Springex;

public class Doctor implements Hospital{

	private int DId;
	private String DName;
	
	//generate the constructor here
	public Doctor(int dId, String dName) {
		super();
		DId = dId;
		DName = dName;
	}
	
	@Override
	public void work() {
		System.out.println("Doctors details are here....");
		System.out.println("Doctor ID="+DId);
		System.out.println("Doctor Name="+DName);
	}
	}

	