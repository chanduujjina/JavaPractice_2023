package com.demo.object;

public class ObjectDemo1 {

	public static void main(String[] args) {
		ObjectDemo1 demo = new ObjectDemo1();
		Activity activity = new Activity();
		activity.setId(1);
		demo.m1(activity);
		System.out.println(activity.toString());//
		
	}

	private  void m1(Activity activity) {
		
		activity.setName("Test");
	}
	
	

}
