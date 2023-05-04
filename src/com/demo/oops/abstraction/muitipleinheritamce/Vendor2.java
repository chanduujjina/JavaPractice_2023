package com.demo.oops.abstraction.muitipleinheritamce;

public class Vendor2 implements Provider1,Provider2{

	@Override
	public void m1() {
		System.out.println("Inside Vendor2 m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("Inside Vendor2 m2 method");
		
	}

}
