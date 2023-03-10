package com.demo.logical;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
       int inputNumber =3;
       //2,3,5
       //if any number having factor count is equal 2 then we can call that number as prime number
       
       int count=0;
		for(int i=1;i<=inputNumber;i++) {
			if(inputNumber%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(inputNumber+ " IS PRIME");
		}
		else {
			System.out.println(inputNumber+ " IS not PRIME");
		}
	}

}
