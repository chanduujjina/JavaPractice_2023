package com.demo.string;

public class StringDemo1 {

	public static void main(String[] args) {
	
		//ways of creating String
		String s1 ="test";
		
		String s2 ="test";
		
		String s3 = new String("test");
		
		//how to compare data
		
		if(s1==s2) {
			System.out.println("s1==s2 is true");
		}
		
		if(s1==s3) {
			System.out.println("s1==s3 is true");
		}
		else {
			System.out.println("s1==s3 is false");
		}
		
		if(s1==s3) {
			System.out.println("s1==s3 is true");
		}
		else {
			System.out.println("s1==s3 is false");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1.equals(s3) is true");
		}

	}

}
