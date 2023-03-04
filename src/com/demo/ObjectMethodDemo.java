package com.demo;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println(e1.hashCode());
		
		//hashcode

		Employee e2 = new Employee();
		
		System.out.println(e2.hashCode());
		
		//equals
		boolean equals = e1.equals(e2);
		System.out.println(equals);
		
	}

}
