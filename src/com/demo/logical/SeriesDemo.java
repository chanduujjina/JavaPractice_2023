package com.demo.logical;

public class SeriesDemo {

	public static void main(String[] args) {
		
		//1,2,3,4,5,6,7,8,9,10
		
		for(int i=1;i<=10;i++) {
			
			if(i>=3 && i<=7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
