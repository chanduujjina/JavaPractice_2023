package com.demo.oops.polymorphism.exercise;

public class Derived extends Base{
	
	@Override
	public Child getInstance() {
		return new Child();
	}
	
	/*@Override
	public Parent getInstance(String num1) {//CE
		return new Child();
	}*/

}
