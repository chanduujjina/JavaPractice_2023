package com.demo.staticInfo;

public class OuerClassInner {
	

	private String name;
	
	class Innerclass {
		
		void m1() {
			System.out.println("inside m1 name:"+name);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		OuerClassInner ouerClassInner = new OuerClassInner();
		ouerClassInner.setName("chandu");
		
		Innerclass innerclass = ouerClassInner.new Innerclass();
		innerclass.m1();
	}

}
