package com.demo.staticInfo;

public class Outerclass {
	
	private static String val ="test";
	
	public static void m4() {
		System.out.println("inside m4 Outerclass class");
	}
	
	public void m5() {
		System.out.println("inside m5 Outerclass class");
	}
	
	
	static class StaticInnerclass1 {
		 static void  m1() {
			 System.out.println("inside StaticInnerclass m1 method "+val);
			 m4();
			 Outerclass outerclass = new Outerclass();
			 outerclass.m5();
		 }
		 
		 static void  m2() {
			 System.out.println("inside StaticInnerclass m2 method "+val);
		 }
		 
		 void m3() {
			 System.out.println("inside StaticInnerclass m3 method "+val);
		 }
	}
	
	static class StaticInnerclass2 {
		 static void  m1() {
			 System.out.println("inside StaticInnerclass m1 method "+val);
		 }
		 
		 static void  m2() {
			 System.out.println("inside StaticInnerclass m2 method "+val);
		 }
	}
	
	public static void main(String[] args) {
		Outerclass.StaticInnerclass1.m1();
		Outerclass.StaticInnerclass1.m2();
		Outerclass.StaticInnerclass2.m2();
		
		//To invoke  non static method in nested static class you need to cteate object nested static class
		
		Outerclass.StaticInnerclass1 stInnerclass1= new Outerclass.StaticInnerclass1();
		stInnerclass1.m3();
		
		
		
	}

}
