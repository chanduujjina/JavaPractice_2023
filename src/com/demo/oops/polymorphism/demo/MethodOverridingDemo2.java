package com.demo.oops.polymorphism.demo;

import com.demo.oops.polymorphism.BasicModelPhone;
import com.demo.oops.polymorphism.Lenovo;
import com.demo.oops.polymorphism.Redme;

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
