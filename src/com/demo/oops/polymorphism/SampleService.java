package com.demo.oops.polymorphism;

public class SampleService {
	
	public void m1(String val) {
		System.out.println("Inside m1 "+val);
	}
	
	
	
	public void m1(int val) {
		System.out.println("Inside m1"+val);
	}
	
	public int m1(int a,int b) {
		return a+b;
	}
	
	public int m1(String a,int b) {
		return Integer.parseInt(a)+b;
	}
	
	public int m1(int a,String b) {
		return a+Integer.parseInt(b);
	}
	
	public String getStringVal(int val) {
		return String.valueOf(val);
	}
	
	public String getStringVal(Double val) {
		return String.valueOf(val);
	}
	
	public String getStringVal(Long val) {
		return String.valueOf(val);
	}

}
