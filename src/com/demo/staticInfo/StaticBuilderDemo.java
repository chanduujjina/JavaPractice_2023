package com.demo.staticInfo;

public class StaticBuilderDemo {

	public static void main(String[] args) {
		
		
	Account account = new Account.AccountBuilder("1234567891","chandu").branchName("Upppal Branch").ifscCode("ICICI001").build();
	System.out.println(account);
	
	Account account2 = new Account.AccountBuilder("987654321","Sushma").build();
	
	System.out.println(account2);

	}

}
