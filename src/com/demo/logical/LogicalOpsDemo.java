package com.demo.logical;

public class LogicalOpsDemo {

	public static void main(String[] args) {
		
		
		int starIndex=1;
		
		int lastIndex=20;
		
		int middleIndex=30;
		
		
		if((starIndex<=0 &&  middleIndex >=10) || lastIndex>20) {
			System.out.println("inside if loop");
		}
		
		else {
			System.out.println("inside else");
		}

	}

}
