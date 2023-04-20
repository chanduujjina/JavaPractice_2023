package com.demo.stringBuilder;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder();
		
		builder1.append("This");
		
		
		
		StringBuilder builder2 = new StringBuilder('a');
		
		StringBuilder builder3 = new StringBuilder("Test");
		
		System.out.println(builder1);
		System.out.println(builder2);
		System.out.println(builder3);
		

	}

}
