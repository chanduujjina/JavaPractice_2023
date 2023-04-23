package com.demo.oops.inheritance;

public class Child1 extends Parent1 {
	
	private String childName;
	
	private String childType;
	
	public Child1() {
		
	}
	
	public Child1(String childName,String childType,String parentName,String relationType,String gender) {
		super(parentName,relationType,gender);
		this.childName=childName;
		this.childType=childType;
	}
	
	
	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getChildType() {
		return childType;
	}

	public void setChildType(String childType) {
		this.childType = childType;
	}
	
	public void setParentName(String parentName) {
		super.setParentName(parentName);
	}
	
	public void setRelaionType(String relationype) {
		super.setRelaionType(relationype);
	}
	
	public void setGender(String gender) {
		super.setGender(gender);
	}
	
	@Override
	public String toString() {
		return "Child1 [childName=" + childName + ", childType=" + childType + "]";
	}

}
