package com.demo.finalinfo.demo;

import java.util.Date;

public final class Employee {
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", gender=" + gender + ", dob=" + dob + "]";
	}

	private final int eId;
	
	private final String eName;
	
	private final String gender;
	
	//mutable reference
	private final Date dob;
	
	public Employee(int eId, String eName, String gender, Date dob) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.gender = gender;
		
		Date tempDate = new Date(dob.getYear(),dob.getMonth(),dob.getYear());
		this.dob = tempDate;
	}
	
	public int geteId() {
		return eId;
	}

	public String geteName() {
		return eName;
	}

	public String getGender() {
		return gender;
	}

	public Date getDob() {
		Date tempDate = new Date(dob.getYear(),dob.getMonth(),dob.getYear());
		return tempDate;
	}

}
