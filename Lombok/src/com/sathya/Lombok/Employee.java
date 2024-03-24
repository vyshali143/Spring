package com.sathya.Lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
	public class Employee {

		private int EmpId;
		private String EmpName;
		private double EmpSalary;

	}


