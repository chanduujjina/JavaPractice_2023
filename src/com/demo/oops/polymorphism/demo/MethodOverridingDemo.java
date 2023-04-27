package com.demo.oops.polymorphism.demo;

import com.demo.oops.polymorphism.Lenovo;
import com.demo.oops.polymorphism.Redme;

public class MethodOverridingDemo {
	
	public static void main(String[] args) {
		
		Lenovo lenovo = new Lenovo();
		lenovo.recording();
		
		lenovo.camera();
		
		
		Redme redme = new Redme();
		redme.recording();
		redme.camera();
	}

}
