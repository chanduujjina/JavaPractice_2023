package com.demo.oops.polymorphism.exercise;

public class Base {
	
	public Parent getInstance() {
		return new Child();
	}
	
	public Parent getInstance(int num1) {
		return new Child();
	}

}
