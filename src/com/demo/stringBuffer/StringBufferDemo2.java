package com.demo.stringBuffer;

public class StringBufferDemo2 {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("This is chandu");
		
		buffer.replace(0, 4, "test");
		
		System.out.println(buffer);
		
		StringBuffer stringBuffer = new StringBuffer("chandu");
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
	}

}
