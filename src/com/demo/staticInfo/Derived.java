package com.demo.staticInfo;

public class Derived extends Base{
	
	
	public static void m1() {
		System.out.println("inside m1() method");
	}
	
	public static void m1(int num1,int num2) {
		System.out.println("inside m1() method "+num1+ ","+num2);
	}
	
	@Override
	public void m2() {
		System.out.println("inside m2() method");
	}
	
	

}
