package com.demo.innerclassInfo;

public class AnnonmousDemo {
	
	public static void main(String[] args) {
		Validator validator = new Validator() {
			
			@Override
			public Boolean isValidEmployee() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public Boolean isValidAddress() {
				// TODO Auto-generated method stub
				return true;
			}
		};
		
		Boolean validAddress = validator.isValidAddress();
		System.out.println(validAddress);
		
		Boolean validEmployee = validator.isValidEmployee();
		System.out.println(validEmployee);
	}

}
