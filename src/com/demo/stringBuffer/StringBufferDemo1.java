package com.demo.stringBuffer;

public class StringBufferDemo1 {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("This is chandu");
		
		
		//to insert String
		buffer.insert(buffer.length(), " Ujjina");
		System.out.println(buffer);
		
		
		//to insert character
		buffer.insert(buffer.length(), 'L');
		System.out.println(buffer);
		
		//delete value from buffer
		
		buffer.delete(0, 4);
		System.out.println(buffer);
		
		//insert intger into String buffer
		buffer.insert(buffer.length(), 8);
		System.out.println(buffer);
		
		//insert character array into String buffer
		
	 char chArray [] = {'t','e','s','t'};
	 
	 buffer.insert(buffer.length(), chArray);
	 System.out.println(buffer);
	 
	 
		
		
		
	}

}
