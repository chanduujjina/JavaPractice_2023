package com.demo.staticInfo;

public class OuterLocalclass {
	
	private  String name = "chandu";
	
	public void m1() {
		
		class Localclass implements BaseInterface{
			
			public void m2() {
				System.out.println("inside Localclass m2 method"+name);
			}

			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
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
