package com.demo.oops.polymorphism.demo;

import com.demo.oops.polymorphism.SampleService;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		
		SampleService sampleService = new SampleService();
		
		sampleService.m1(1);
		
		sampleService.m1("test");
		
		int result = sampleService.m1(1, 2);
		System.out.println(result);

	}

}
