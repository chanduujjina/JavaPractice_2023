package com.demo.oops.inheritance.demo;

import com.demo.oops.inheritance.Child1;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		
       Child1 child1 = new Child1();
       child1.setChildName("Test child1");
       child1.setChildType("son");
       
       child1.setParentName("Test Parent");
       child1.setRelaionType("Father");
       child1.setGender("Male");
       
       System.out.println(child1.getParentName());
       
       Child1 child2 = new Child1("Test child2","Daughter","Test Parent1","Mother","female");
       System.out.println(child2.toString());
       
       System.out.println(child2.getParentName());
       
	}

}