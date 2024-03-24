package com.sathya.Springex;

public class Pharmacy {

	private String Pname;
	private String Plocation;
	public Pharmacy(String pname, String plocation) {
		super();
		this.Pname = pname;
		this.Plocation = plocation;
	}
	public void pharmacy()
	{
		System.out.println("here the details of pharmacy....");
		System.out.println("Pharmacy name is"+Pname);
		System.out.println("Pharmacy Location is"+Plocation);
	}
}
