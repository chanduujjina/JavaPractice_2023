package com.demo;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Karthik");
		
		e1.setGender("male");
		
		e1.setDeptName("it");
		
		e1.setSalary(100000d);
		
		System.out.println(e1);
		
		System.out.println(e1.getClass());

		Employee e3 = new Employee();
		e3.setId(1);
		e3.setName("Karthik");
		
		e3.setGender("male");
		
		e3.setDeptName("it");
		
		e3.setSalary(100000d);
		
		System.out.println(e3);
		
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Shasank");
		
		e2.setGender("male");
		
		e2.setDeptName("it");
		
		e2.setSalary(100000d);
		
		System.out.println(e2);
		
		


	}

}
