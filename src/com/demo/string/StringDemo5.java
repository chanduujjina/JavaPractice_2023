package com.demo.string;

import java.util.Arrays;

public class StringDemo5 {
	
	public static void main(String[] args) {
		
		//split
		
		String sentance = "This demo is used to demonstarte the use of split";
		
		//{"This","demo"}
		
		String[] wordArray = sentance.split(" ");
		
	    for(String word:wordArray) {
	    	System.out.println(word);
	    }
	    
	  String filePath = "c:\\chandu\\abc.jpeg";
	  //"c:\\chnadu\Test.pdf
	  //c:\\chnadu\Test.xml
	  //c:\\chnadu\Test.jpeg
	  //c:\\chandu\\Test\\Test.pdf
	  
	  String substring1 = filePath.substring(filePath.lastIndexOf("\\")+1, filePath.length());
	  
	  System.out.println(substring1);
	  
	  String substring2 = filePath.substring(filePath.lastIndexOf("\\")+1, filePath.indexOf("."));
	  System.out.println(substring2);
	  
	  String substring3 = filePath.substring(0,filePath.lastIndexOf("\\"));
	  System.out.println(substring3);
	  
	  String result = substring3+"\\"+substring2+"\\"+substring1;
	  System.out.println(result);
	  
	  
	  /*   String[] pathArray = filePath.split("\\");
	    
	    for(String path:pathArray) {
	    	System.out.println(path);
	    }*/
		
		//substring
		
	 //index of
	  int indexVal= filePath.indexOf("\\")+1;
	  System.out.println(indexVal);
	  //last index of
	  
	  int indexVal1 = filePath.lastIndexOf("\\")+1;
	  System.out.println(indexVal1);
	  
		
		
	}

}
