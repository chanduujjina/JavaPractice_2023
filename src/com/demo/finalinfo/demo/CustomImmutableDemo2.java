package com.demo.finalinfo.demo;

import java.util.Date;

public class CustomImmutableDemo2 {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "chandu", "male", new Date());
		
		System.out.println(employee);
		
		System.out.println("----------after mutating data in object------------");
		
		Date dob = employee.getDob();
		dob.setTime(12);
		
		System.out.println(employee);
		

	}

}
