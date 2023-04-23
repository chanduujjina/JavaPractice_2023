package com.demo.oops.inheritance;

public class Parent1 {
	
	private String parentName;
	
	private String relaionType;
	
	private String gender;
	
	public Parent1(String parentName, String relaionType,String gender) {
		this(parentName,gender);
		this.relaionType = relaionType;
	}
	
	public Parent1(String parentName, String gender) {
		this.gender = gender;
		this.parentName= parentName;
	}

	public Parent1() {
		
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getRelaionType() {
		return relaionType;
	}

	public void setRelaionType(String relaionType) {
		this.relaionType = relaionType;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}
