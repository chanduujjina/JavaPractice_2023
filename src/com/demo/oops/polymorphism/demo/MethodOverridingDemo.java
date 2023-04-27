package com.demo.oops.polymorphism.demo;

import com.demo.oops.polymorphism.runtime.Lenovo;
import com.demo.oops.polymorphism.runtime.Redme;

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
