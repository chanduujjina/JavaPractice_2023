package com.demo.arrayHandle;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		//dynamic way of creation of Array
		
		Integer numberArray [] = new Integer[4];
		
		numberArray[0] =10;
		numberArray[1] =20;
		numberArray[2] =30;
		numberArray[3] =20;
		
		for(int number : numberArray) {
			System.out.println(number);
		}
		
		Integer numberArray1 [] = new Integer[10];
		
		//adding elements to the array
		for(int i=0;i<numberArray1.length;i++) {
			numberArray1[i]	=i;
		}
		
		//fetching the elements from Array
		for(int number:numberArray1) {
			System.out.println(number);
		}

	}

}
