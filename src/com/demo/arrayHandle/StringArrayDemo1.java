package com.demo.arrayHandle;

public class StringArrayDemo1 {

	public static void main(String[] args) {
		
		String nameArray[] = {"chandu","Karthik","Sadhank","Divya"};
		
		
		
		String nameArray1[] = new String[10];
		
		
		String evenArray[]= new String[10];
		
		String oddArray[]= new String[10];
		for(int i=0;i<nameArray1.length;i++) {
			
			nameArray1[i] ="test"+i;
			System.out.println(nameArray1[i]);
			
			if(i%2==0) {
				evenArray[i]="test"+i;
			}
			else {
				oddArray[i]="test"+i;
			}
			
		}
		
		System.out.println("-----------------------------------------------------------");
		for(String even :evenArray) {
			if(even != null) {
			System.out.println(even);
			}
		}
		System.out.println("---------------------------------------------------------");
		
		for(String odd :oddArray) {
			if(odd != null) {
			System.out.println(odd);
			}
		}
		
	}

}
