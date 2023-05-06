package com.demo.staticInfo;

public class StaticDemo2 {
	
	private static Integer numberArray[] = new Integer[4];//1
	
	private static String nameArray[] = new String[5];
	
	static {//2
		numberArray[0]=1;
		numberArray[1]=2;
		numberArray[2]=3;
		numberArray[3]=4;
	}
	
	static {
		String defaultVal ="test";
		
		for(int i=0;i<nameArray.length;i++) {
			nameArray[i]= defaultVal+i;
		}
	}
	
	
	public static Integer[] getNumberArray() {//3 will invoke when call triggered
		return numberArray;
	}
	
	public static void main(String[] args) {
		Integer[] numberArray = StaticDemo2.getNumberArray();
		
		for(Integer num : numberArray) {
			System.out.println(num);
		}
		
		String[] nameArray2 = StaticDemo2.nameArray;
		
		for(String val : nameArray2) {
			System.out.println(val);
		}
	}
	

}
