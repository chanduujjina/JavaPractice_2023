package com.demo;

public class MethodDemo {
	
	
	@Override
	public String toString() {
		return "MethodDemo [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	
	
	//method defination
	public void m1() {
		System.out.println("Inside m1");
	}
	
	public void m2(String name) {
		System.out.println("Hi "+name);
	}
	
	public int add(int num1,int num2) {
		int c = num1+num2;
		return c;
	}
	
	public int add1(int ... numArray) {
		int result=0;
		for(int i=0;i<numArray.length;i++) {
			result=result+numArray[i];
		}
		return result;
	}
	
	public String appendNames(String ...companyNames) {
		String response= "";
		for(int i=0;i<companyNames.length;i++) {
			response=response+" "+companyNames[i];
		}
		return response;
	}
	
	public void m3(MethodDemo methodDemo) {
		methodDemo = null;
	}
	
	public void m4(MethodDemo methodDemo) {
		methodDemo.setName("chandu");
	}
	
	
	
	public static void main(String[] args) {
		MethodDemo methodDemo = new MethodDemo();
		methodDemo.m1();//method call
		
		methodDemo.m2("Karthik");
		int result = methodDemo.add(1, 2);
		System.out.println(result);
		
		//methodDemo.m3(methodDemo);
		//System.out.println(methodDemo.toString());
		
		methodDemo.m4(methodDemo);
		System.out.println(methodDemo.toString());
		
		int result1 = methodDemo.add1(1,2,3,4,5,6);
		System.out.println(result1);
		
		String appendNames = methodDemo.appendNames("TCS","Infosys","Incedo");
		System.out.println(appendNames);
		
	}

}
