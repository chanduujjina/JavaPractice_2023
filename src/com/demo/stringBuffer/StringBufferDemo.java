package com.demo.stringBuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("test1");
		
		//to convert String buffer to String
		System.out.println(buffer.toString());
		
		buffer.append(",test2");
		
		System.out.println(buffer);
		
		buffer.append(",test3");
		
		System.out.println(buffer);
		
		
		
	}

}
