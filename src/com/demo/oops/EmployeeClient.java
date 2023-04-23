package com.demo.oops;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEid(1);
		
		e1.seteName("chandu");
		
		e1.setGender("Male");
		
		e1.setDept("it");
		
		Employee e2 = new Employee();
		
        e2.setEid(2);
		
		e2.seteName("Karthik");
		
		e2.setGender("Male");
		
		e2.setDept("it");
		
		System.out.println(e1.toString());
		
		System.out.println(e2.toString());
		
		
		Employee e3 = new Employee(3,"Ramudu","male","it");
		System.out.println(e3.toString());
		
		Employee e4 = new Employee(4,null,"male", null);
		System.out.println(e4.toString());
		
		
		
	}

}
