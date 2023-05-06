package com.demo.staticInfo;

public class MethodHidingDemo {
	
	public static void main(String[] args) {
		
		Base base = new Derived();
		
		base.m1();
		
		base.m2();
		
		Derived derived = new Derived();
		
		derived.m1();
		
		
		derived.m1(1, 2);
	}

}
