package com.demo.staticInfo;

public class Outerclass {
	
	private static String val ="test";
	
	
	static class StaticInnerclass {
		 static void  m1() {
			 System.out.println("inside StaticInnerclass m1 method "+val);
		 }
		 
		 static void  m2() {
			 System.out.println("inside StaticInnerclass m2 method "+val);
		 }
	}
	
	public static void main(String[] args) {
		Outerclass.StaticInnerclass staticInnerclass = new Outerclass.StaticInnerclass();
		staticInnerclass.m1();
		staticInnerclass.m2();
	}

}
