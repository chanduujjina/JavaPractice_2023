package com.demo.classloader;

public class ClassLoader {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> cls = Class.forName("com.demo.classloader.Sample");
		
		Sample sample = (Sample)cls.newInstance();
		
		System.out.println(sample.hashCode());
		
		
		Sample sample1 = (Sample)cls.newInstance();
		System.out.println(sample1.hashCode());
		
		
	}

}
