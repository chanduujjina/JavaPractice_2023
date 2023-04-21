package com.demo.object;

import com.demo.arrayHandle.Sample;

public class ObjectDemo3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sample sample1 = new Sample();
		
		
		sample1.setSampleName("test");
		System.out.println(sample1.toString());
		
		Sample sample2 = (Sample)sample1.clone();
		System.out.println(sample2.toString());
		
		sample2.setSampleId(1);
		
		System.out.println(sample2.toString());
		System.out.println(sample1.toString());
		
	}

	
	
	

}
