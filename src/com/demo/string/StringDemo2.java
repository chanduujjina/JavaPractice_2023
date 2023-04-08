package com.demo.string;

public class StringDemo2 {

	public static void main(String[] args) {
	
		//ways of creating String
		
		String s1 = "Test";
		
		String s3= "Test";
		
		
		String s2 = new String("Test");
		
		if(s1==s2) {
			System.out.println("inside s1==s2");
		}
		
		if(s1.equals(s2)) 	{
			System.out.println("inside s1.equals(2)");
		}
		
		if(s1==s3) {
			System.out.println("inside s1==s3");
		}
		
		//usage of intern
		//to move the value from heap to String pool area
		
		String s4 = s2.intern();
		
		if(s4==s1) {
			System.out.println("inside s4==s1");
		}

	}

}
