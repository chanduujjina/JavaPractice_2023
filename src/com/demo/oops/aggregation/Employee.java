package com.demo.oops.aggregation;

import java.util.Arrays;

public class Employee {
	
	private int empId;
	private String empName;
	private String department;
	private Company company;
	private TechStack[] teckStack;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public TechStack[] getTeckStack() {
		return teckStack;
	}
	public void setTeckStack(TechStack[] teckStack) {
		this.teckStack = teckStack;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", company="
				+ company + ", teckStack=" + Arrays.toString(teckStack) + "]";
	}
	
	

}
