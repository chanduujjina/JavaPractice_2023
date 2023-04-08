package com.demo.arrayHandle;

public class NumberSortalogo {

	public static void main(String[] args) {
		
		Integer numberArray [] = {8,5,6,3,1,2};
		
		
		for(int i=0;i<numberArray.length;i++) {
			
			for(int j=i+1;j<numberArray.length;j++) {
				
				//compare and swap
				
				int temp=0;
				if(numberArray[i]<numberArray[j]) {
					temp=numberArray[i];
					numberArray[i]=numberArray[j];
					numberArray[j] = temp;
				}
				
			}
		}
		
		//iteate and print the array
		
		for(int num:numberArray) {
			System.out.println(num);
		}
		
		// 5,8,6,3,1,2
		//5,8,6,3,1,3
		//3,8,6,5,1,2
		//1,8,6,5,3,2
       
		
		//1,6,8,5,3,2
		//1,5,8,6,3,2
		//1,3,8,6,5,2
		//1,2,8,6,5,3
	}

}
