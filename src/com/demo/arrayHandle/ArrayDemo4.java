package com.demo.arrayHandle;

import java.util.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		Integer numberArray1 [] = {1,2,3,4,6,8};
		
		
		
		Integer[] numberArray1Copy = Arrays.copyOf(numberArray1, numberArray1.length+2);
		
		//System.out.println(numberArray1Copy.length);
		
		numberArray1Copy[6]=4;
		numberArray1Copy[7]=5;
		
		for(int num:numberArray1Copy) {
			//System.out.println(num);
		}
		
		//copy of array by using range(start index to end index)
		
		Integer[] copyOfRange = Arrays.copyOfRange(numberArray1, 2,numberArray1.length);
		
		for(int val:copyOfRange) {
			System.out.println(val);
		}

	}
	
	

}
