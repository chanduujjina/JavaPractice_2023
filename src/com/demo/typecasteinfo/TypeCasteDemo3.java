package com.demo.typecasteinfo;

public class TypeCasteDemo3 {
	
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		//narrowing typecasting
		Child child = (Child) parent;
		
		//widening typecasting
		Parent parent1 = child;
		
	     Parent parent2 = new Parent();
	     
	     Child child1 = (Child) parent2;
	     
	     Child child2 = new Child();
	     
	     Parent parent3  = child2;
		
	}

}
