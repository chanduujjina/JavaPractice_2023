package com.demo.arrayHandle;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		//integer array
		
		int numberArray [] = {1,2,3,4,5,6,7,8,9};
		//0 to n-1
		
		int firstIndex = numberArray[0];
		int lstsInd = numberArray[8];
		
		//System.out.println(firstIndex);
		
		
		//i 0,9
		//System.out.println(lstsInd);
		for(int i=0; i<=numberArray.length-1; i++) {
			System.out.println(numberArray[i]);
		}
		System.out.println("-------------------------------------------");
		//update the element in th array
		numberArray[0] =10;
		numberArray[8] =11;
		
		for(int i=0; i<numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
		

	}

}
