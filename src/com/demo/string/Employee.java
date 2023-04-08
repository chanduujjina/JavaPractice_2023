package com.demo.string;

public class Employee {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(String name, Long employeeId, String dob, String gender) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.dob = dob;
		this.gender = gender;
	}

	private String name;
	
	private Long employeeId;
	
	private String dob;
	
	private String gender;
	
	

}
