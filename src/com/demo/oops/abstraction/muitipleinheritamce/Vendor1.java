package com.demo.oops.abstraction.muitipleinheritamce;

public class Vendor1 extends BaseProvider implements Provider1,Provider2{

	@Override
	public void m1() {
		System.out.println("Inside Vendor1 m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("Inside Vendor1 m2 method");
		
	}

	@Override
	public void m4() {
		System.out.println("Inside Vendor1 m4 method");
		
	}

}
