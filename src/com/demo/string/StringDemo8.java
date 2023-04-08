package com.demo.string;

public class StringDemo8 {

	public static void main(String[] args) {
		
	
		
		String value = "chnadu123";
		
		if(value.matches("^\\d+$")) {
			System.out.println("its a number");
		}
		else if(value.matches("^[a-zA-Z]*$")) {
			System.out.println("its alpha value");
		}
		
		else if(value.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("its alphanumeric value");
		}
		
		String value1 = "chandu 123 test 128";
		
		//separate alpha and numeric values
		
		//1.split the String with space
		
		String[] valArray = value1.split(" ");
		
		for(String val :valArray) {
			if(val.matches("^\\d+$")) {
				System.out.println("number "+val);
			}
			else if(val.matches("^[a-zA-Z]*$")) {
				System.out.println("alpha "+val);
			}
		}

	}

}
