package com.demo.cloning;

import com.demo.Employee;

public class CloningDemo {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		emp1.setName("Karthik");
		emp1.setGender("male");
		emp1.setDeptName("it");
		
		/*Employee emp2 = new Employee();
		emp2.setName("Karthik");
		emp2.setGender("male");
		emp2.setDeptName("it");*/
		
		Employee emp2=emp1;
		emp2.setSalary(100000d);
		emp2.setId(1);
		System.out.println(emp1.toString());
		
		System.out.println(emp2.toString());
		
	}

}
