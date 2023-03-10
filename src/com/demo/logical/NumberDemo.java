package com.demo.logical;

public class NumberDemo {
	
	public static void main(String[] args) {
		
		//print even and odd from sequnce 1 to 100
		
		int startIndex=10;
		int lastIndex=100;
		
		//IntStream.iterate(1, i->i+1).limit(100).filter(i->i%2==1).forEach(num->System.out.println(num));
		
		for(int i=startIndex;i<=lastIndex;i++) {
			
			if(i%2==0) {
				System.out.println(i+ "is even");
			}
			else {
				System.out.println(i+ "is odd");
			}
		}
		
	}

}
