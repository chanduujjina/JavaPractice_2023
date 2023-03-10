package com.demo.logical;

public class FactorDemo {
	
	public static void main(String[] args) {
		
		int inputNumber =125;
		//1,,2,3,4,5,6,7,8,9
		
		for(int i=1;i<=inputNumber;i++) {
			if(inputNumber%i==0) {
				System.out.println(i);
			}
		}
	}

}
