package com.demo.logical;

public class NumberComputeDemo {
	

	public static void main(String[] args) {
		int num1=10;
		int num2=30;
		NumberComputeDemo computeDemo = new NumberComputeDemo();
		int result = computeDemo.computeValues_v1(num1,num2);
		System.out.println(result);
		int result1 = computeDemo.computeValues_v2(num1, num2);
		System.out.println(result1);

	}

	private  int computeValues_v1(int num1, int num2) {
		int result =0;
		if(num1>=num2) {
			result= num1-num2;
		}
		else if(num2>=num1) {
			result= num2-num1;
		}
		
		return result;
		
	}
	
	private  int computeValues_v2(int num1, int num2) {
		int result = num1>=num2 ? num1-num2 : num2-num1;
		return result;
		
	}


}
