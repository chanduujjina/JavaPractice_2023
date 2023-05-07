package com.demo.staticInfo;

public class Account {
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", branchName="
				+ branchName + ", ifscCode=" + ifscCode + "]";
	}


	private final String accountNumber;//required
	
	private final String accountHolderName;//required
	
	private final String branchName;//optional
	
	private final String ifscCode;//optional
	
	
	//to make others not to create object from outside
	private Account(AccountBuilder accountBuilder) {
		this.accountNumber=accountBuilder.accountNumber;
		this.accountHolderName =accountBuilder.accountHolderName;
		this.branchName=accountBuilder.branchName;
		this.ifscCode = accountBuilder.ifscCode;
	}
	
	
	public static class AccountBuilder {
		

	private String accountNumber;
	

	private  String accountHolderName;
	
	private  String branchName;
	
	private  String ifscCode;
	
	public AccountBuilder(String accountNumber,String accountHolderName) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
	}
	
	public  AccountBuilder accountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
		return this;
	}
	
	public  AccountBuilder accountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
		return this;
	}
	
	public  AccountBuilder branchName(String branchName) {
		this.branchName=branchName;
		return this;
	}
	
	public  AccountBuilder ifscCode(String ifscCode) {
		this.ifscCode=ifscCode;
		return this;
	}
	
	public Account build() {
		return new Account(this);
	}
	
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public String getBranchName() {
		return branchName;
	}


	public String getIfscCode() {
		return ifscCode;
	}

}
