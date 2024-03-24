package com.sathya.builder;

public class Test {

	public static void main(String args[])
	{
		Employee employee=Employee.builder()
				                   .EmpId(101)
				                   .EmpName("DEEPU")
				                   .EmpSalary(55000)
				                   .build();
		System.out.println(employee);
	}
}
