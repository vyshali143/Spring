package com.sathya.EqualandHashcode;

import com.sathya.Lombok.Employee;

public class Test {
	public static void main(String args[])
	{
	//constructor injecting the values
		Employee employee=new Employee(111,"vyshu",231443.09);
		System.out.println(employee);
		
		//Setter injecting the values
		Employee emp=new Employee();
		emp.setEmpId(121);
		emp.setEmpName("bepi");
	    emp.setEmpSalary(550000.08);
	    System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSalary());
		}
}