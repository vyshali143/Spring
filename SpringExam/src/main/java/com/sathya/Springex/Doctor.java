package com.sathya.Springex;

public class Doctor {

	private int Did;
	private String Dname;
	public Doctor(int did, String dname) {
		super();
		this.Did = did;
		this.Dname = dname;
	}

	public void doctor()
	{
		System.out.println("details of doctor");
		System.out.println("Doctor Id number ="+Did);
		System.out.println("Doctor Name ="+Dname);
	}
}
