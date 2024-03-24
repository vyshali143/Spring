package com.sathya.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {

	private int EmpId;
	private String EmpName;
	private double EmpSalary;
}
