package com.demo.oops.polymorphism.demo;

import com.demo.oops.polymorphism.runtime.BasicModelPhone;
import com.demo.oops.polymorphism.runtime.Lenovo;
import com.demo.oops.polymorphism.runtime.Redme;

public class MethodOverridingDemo2 {
	
	public static void main(String[] args) {
		
		BasicModelPhone basicModelPhone = new Lenovo();
		basicModelPhone.recording();
		
		basicModelPhone.camera();
		
		
		BasicModelPhone basicModelPhone1 = new Redme();
		basicModelPhone1.recording();
		basicModelPhone1.camera();
	}

}
