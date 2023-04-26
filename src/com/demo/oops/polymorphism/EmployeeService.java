package com.demo.oops.polymorphism;

public class EmployeeService {
	
	public EmployeeInfo getEmployee(int eid) {
		return new EmployeeInfo(eid,null);
	}
	
	
	public EmployeeInfo getEmployee(String name) {
		return new EmployeeInfo(0,name);
	}

}
