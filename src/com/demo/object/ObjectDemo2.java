package com.demo.object;

import com.demo.arrayHandle.Sample;

public class ObjectDemo2 {

	public static void main(String[] args) {
		
		Sample sample1 = new Sample();
		
		sample1.setSampleId(1);
		sample1.setSampleName("test");
		System.out.println("Sample1:"+sample1.toString());
		System.out.println("---------------------------------------------- after shall clone");
		Sample sample2 = sample1;
		System.out.println("Sample2"+sample2.toString());
		sample2.setSampleName("test1");
		System.out.println("---------------------------------------------- after shall clone after chnaging data");
		System.out.println("Sample2:"+sample2.toString());
		System.out.println("Sample1:"+sample1.toString());
		
		
	}

	
	
	

}
