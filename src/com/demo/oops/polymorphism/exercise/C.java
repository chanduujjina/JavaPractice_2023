package com.demo.oops.polymorphism.exercise;

class A {
	
}

class B extends A {
	
}


public class C {
	
	
	public B getInstance() {
		return new B();
	}
	
	public A getInstance(int val) {
		return new B();
	}
	
	
	public A getInstance(String val) {
		return new A();
	}
	
	public static void main(String[] args) {
		C c = new C();
		
		A instance = c.getInstance("test");
		A instance2 = c.getInstance(1);
	}

}


