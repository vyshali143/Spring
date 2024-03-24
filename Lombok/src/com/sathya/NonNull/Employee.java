package com.sathya.NonNull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class Employee {
 
	private int EmpId;
	@NonNull private String EmpName;
	private double EmpSalary;
}
