package com.demo.object;

import com.demo.arrayHandle.Sample;

public class ObjectDemo {

	public static void main(String[] args) {
		
		Sample sample1 = new Sample();
		
		sample1.setSampleId(1);
		sample1.setSampleName("test");
		
		System.out.println(sample1.hashCode());
		
       Sample sample2 = new Sample();
		
       sample2.setSampleId(1);
       sample2.setSampleName("test");
       
       System.out.println(sample2.hashCode());
		
		
	}

	
	
	

}
