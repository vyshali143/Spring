package com.sathya.Lombok;

public class Test {

	public static void main(String args[])
	{
		//Constructor injecting the values
		
		Employee employee=new Employee(111,"Ratan",45000.55);
		System.out.println(employee);
		//setters are injecting the values
		Employee employee2=new Employee();
		employee2.setEmpId(555);
		employee2.setEmpName("Anjali");
		employee2.setEmpSalary(10000.78);
		System.out.println(employee2.getEmpId()+" "employee2.getEmpName()+" "+employee2.getEmpSalary());
	}
}
