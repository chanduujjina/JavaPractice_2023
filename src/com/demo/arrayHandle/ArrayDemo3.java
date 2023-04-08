package com.demo.arrayHandle;

public class ArrayDemo3 {

	public static void main(String[] args) {
		
		//create an object for sample
		
		Sample sample1 = new Sample();
		
		sample1.setSampleId(1);
		sample1.setSampleName("testSample1");
		
      Sample sample2 = new Sample();
		
      sample2.setSampleId(2);
      sample2.setSampleName("testSample2");
		
        //array creation
	   Sample sampleArray [] = new Sample[2];
	   
	   sampleArray[0]= sample1;
	   
	   sampleArray[1]= sample2;
	   
	   //get the objects from an array
	   
	   for(Sample sample :sampleArray) {
		   System.out.println(sample.toString());
	   }
	   
	   //static way of creation
	   
	   Sample sampleArray1 [] = {sample1,sample2};
		

	}

}
