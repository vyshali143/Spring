package com.sathya.Springex;

public class Patient {

	private String PatientName;
	private int PatientAge;
	private Doctor doctor;
	private Pharmacy pharmacy;
	
	public Patient(String patientName, int patientAge, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.PatientName = patientName;
		this.PatientAge = patientAge;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
		
	public void details() {
		System.out.println("Patient name is"+PatientName);
		System.out.println("Patient age is"+PatientAge);
	}
}
	


