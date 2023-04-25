package com.demo.oops.aggregation.demo;

import com.demo.oops.aggregation.Company;
import com.demo.oops.aggregation.Employee;
import com.demo.oops.aggregation.TechStack;

public class EmployeeAggregation {
	
	public static void main(String[] args) {
		Company com = new Company();
		com.setCompanyLocation("Hyderabad");
		com.setCompanyName("Incedo");
		com.setMncCompany(true);
		com.setTeamCount(1000);
		
		TechStack tech1 = new TechStack();
		tech1.setTechSpecialization("Java");
		tech1.setExp(2);
		tech1.setAnyCertificationsDone(true);
		

		TechStack tech2 = new TechStack();
		tech2.setTechSpecialization("React");
		tech2.setExp(3);
		tech2.setAnyCertificationsDone(false);
		
		TechStack tech[] = new TechStack[2];
		tech[0] = tech1;
		tech[1] = tech2;
		
        Employee emp = new Employee();
        emp.setEmpName("karthik");
        emp.setCompany(com);
        emp.setTeckStack(tech);
        emp.setEmpId(606429);
        emp.setDepartment("telecom");
        
        System.out.println(emp.toString());
        
        
        		
	}

}
