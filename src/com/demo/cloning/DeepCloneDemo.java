package com.demo.cloning;

import com.demo.Employee;

public class DeepCloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp1 = new Employee();
		emp1.setName("Karthik");
		emp1.setGender("male");
		emp1.setDeptName("it");
		
		Employee emp2 = (Employee)emp1.clone();
		
		System.out.println("Before doing changes:"+emp1.toString());
		
		System.out.println("Before doing changes"+emp2.toString());
		
		emp1.setId(1);
		
		emp2.setSalary(100000d);
		
       System.out.println("after doing changes:"+emp1.toString());
		
		System.out.println("aftr doing changes"+emp2.toString());

	}

}
