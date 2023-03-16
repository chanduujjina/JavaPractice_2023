package com.demo.logical;

public class SwitchBlockDemo {
	
	public static void main(String[] args) {
		SwitchBlockDemo switchBlockDemo = new SwitchBlockDemo();
		int compute_v1 = switchBlockDemo.compute_v1(10,20,"div");
		//System.out.println(compute_v1);
		int compute_v2 = switchBlockDemo.compute_v2(10, 20, "div");
		//System.out.println(compute_v2);
		int startIndex=1;
		int lastIndex=10;
		Boolean computeStatement = switchBlockDemo.computeStatement(startIndex>0,lastIndex<=10,"and");
		System.out.println(computeStatement);
	}
	
	public Boolean computeStatement(Boolean st1,Boolean st2,String logicalType) {
		switch (logicalType) {
		case "and":
			return st1 && st2;
			
		case "or":
			return st1 || st2;

		default:
			return false;
		}
	}
	
   public int compute_v1(int num1,int num2,String type) {
		if(type.equals("add")) {
			return num1+num2;
		}
		else if(type.equals("sub")) {
			return num1>=num2 ? num1-num2: num2-num1;
		}
		else if(type.equals("div")) {
			return num1>=num2 ? num1/num2: num2/num1;
		}
		else if(type.equals("mul")){
			return num1*num2;
		}
		
		return 0;
	}
	
	public int compute_v2(int num1,int num2,String type) {
		
		switch (type) {
		case "add":
			return num1+num2;
			
		case "sub":
			return num1>=num2 ? num1-num2: num2-num1;
			
		case "div":
			return num1>=num2 ? num1/num2: num2/num1;
			
		case "mul":
			return num1*num2;
			
		default:
			return 0;
		}
		
	}

}
