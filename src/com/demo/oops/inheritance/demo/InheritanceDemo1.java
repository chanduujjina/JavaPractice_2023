 package com.demo.oops.inheritance.demo;

import com.demo.oops.inheritance.Child;
import com.demo.oops.inheritance.Parent;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		String parentName = child.parentName;
		System.out.println(parentName);
		
		String relationType = child.relationType;
		System.out.println(relationType);
		
		String childName = child.childName;
		
		System.out.println(childName);
		
		String childType = child.childType;
		System.out.println(childType);
		
		Parent parent = new Parent();
		
		String parentName2 = parent.parentName;
		System.out.println(parentName2);
		
		
		
		

	}

}
