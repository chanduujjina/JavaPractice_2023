package com.demo.string;

public class StringDemo4 {
	
	public static void main(String[] args) {
		
		//trim->To remove trailing and leading spaces
		
		String value = " This is word ";
		
		String noSpace = value.trim();
		
		System.out.println(noSpace);
		
		String name = "Chandu Ujjina";
		
		//how to check charcter or word in a sentance
		
		boolean isPresent = value.contains("is");
		System.out.println(isPresent);
		
		String val = "Karthiki";
		
		//how to get particular chracter from String
		
		char c1 = val.charAt(4);
		
		System.out.println(c1);
		
		char charAt = val.charAt(val.length()-1);
		System.out.println(charAt);
		
		if(val.contains("K")) {
			int indexOf = val.indexOf("i");
			char charAt2 = val.charAt(indexOf);
			System.out.println(charAt2);
		}
		
		if(val.indexOf("i")>0) {
			char charAt2 = val.charAt(val.indexOf("i"));
			System.out.println(charAt2);
		}
		
		//convert String to array of charcter
		
		char[] charArray = val.toCharArray();
		
		int count =0;
		for(char ch :charArray) {
			if(ch == 'i') {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		
		
	}

}
