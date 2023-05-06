package com.demo.staticInfo;

public class OuterLocalclass {
	
	public void m1() {
		
		class Localclass {
			
			public void m2() {
				System.out.println("inside Localclass m2 method");
			}
			
			
		}
		Localclass localclass = new Localclass();
		localclass.m2();
		
	}
	
	public static void main(String[] args) {
		OuterLocalclass outerLocalclass = new  OuterLocalclass();
		outerLocalclass.m1();
		
	}

}
