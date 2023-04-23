package com.demo.oops.inheritance;

public class EmployeeInhertance {
	
	public static void main(String[] args) {
		ContractEmployee emp = new ContractEmployee();
		emp.setCabFacility(false);
		emp.setContractPeriod(2);
		emp.setEmpId(123);
		emp.setDepartment("Telecom");
		emp.setEmpName("ABCD");
		emp.setPayRoleName("Verizon");
		emp.setGender("Male");
		System.out.println(emp);
	}

}
