package com.demo.staticInfo;

public class StaticDemo1 {
	
	private static String value ="Test";
	
	private static String value1;
	
	static {
		System.out.println("inside static block");
		value1= "Test1";
	}
	
	public static void m1() {
		System.out.println("Inside m1 method");
	}
	
	
	
	public static void main(String[] args) {
		String value2 = StaticDemo1.value;
		System.out.println(value2);
		String value12 = StaticDemo1.value1;
		System.out.println(value12);
		
		StaticDemo1.m1();
		
	}
	
	

}
