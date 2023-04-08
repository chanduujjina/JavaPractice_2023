package com.demo.arrayHandle;

import java.util.Arrays;

public class NumberArraySortDemo2 {
	
	public static void main(String[] args) {
		
		Integer numberArray [] = {8,5,6,3,1,2};
		
		Arrays.sort(numberArray,(a,b)->a-b);
		System.out.println("-----------------------ascending order");
		
		for(int num:numberArray) {
			System.out.println(num);
		}
		
		//sort the elemnts in decending order
		
		Arrays.sort(numberArray, (a,b)->b-a);
		
		System.out.println("-----------------------decending order");
		
		for(int num:numberArray) {
			System.out.println(num);
		}
		
		
		
	}

}
