package com.demo.string;

public class StringDemo3 {

	public static void main(String[] args) {
		
		
		String s1 = "Test";
		s1= s1+" Test1";
		
		String s2 = new String("Test");
		
		s2= s2+" Test1";
		
	   String name = "Chandu";
	   
	   char[] charArray = name.toCharArray();
	   
	   for(char ch :charArray) {
		   System.out.println(ch);
	   }
	   
	   String name1 = "Chandu1";
	   
	   int compareTo = name.compareTo(name1);
	   
	   System.out.println(compareTo);
	   
	   //concat
	   
	   String fullName = name.concat(" Ujjina");
	   
	   String name2 = "chandu";
	   
	   //compare two String by ignoring case sensitive
	   boolean equalsIgnoreCase = name2.equalsIgnoreCase(name);
	   
	   System.out.println(equalsIgnoreCase);
	   
	 //toUpercase
	   String upperCase = name2.toUpperCase();
	   System.out.println(upperCase);
	   
	   //toLowerCase
	   String lowerCase = name1.toLowerCase();
	   System.out.println(lowerCase);
	   

	}

}
