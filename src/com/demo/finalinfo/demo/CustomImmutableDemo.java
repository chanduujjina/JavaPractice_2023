package com.demo.finalinfo.demo;

import com.demo.finalinfo.CusttomImmutbale;

public class CustomImmutableDemo {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("test Buffer");
		CusttomImmutbale customImmutable = new CusttomImmutbale("test","testType",1,stringBuffer);
		System.out.println(customImmutable.toString());
		
		
		StringBuffer stringBuffer2 = customImmutable.getStringBuffer();
		stringBuffer2.append("-Buffer1");
		System.out.println("after changing data in object");
		System.out.println(customImmutable.toString());
		
		

	}

}
