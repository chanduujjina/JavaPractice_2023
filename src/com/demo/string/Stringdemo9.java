package com.demo.string;

public class Stringdemo9 {
	
	public static void main(String[] args) {
		
		EmployeeSerachCriteria serachCriteria = new EmployeeSerachCriteria();
		serachCriteria.setGender("female");
		serachCriteria.setDeptName("it");
		serachCriteria.setName("divya");
		
		
		String baseSql = "select * from employee_info";
	    int count=0;
		if(serachCriteria.getName() != null) {
			if(count==0) {
				baseSql= baseSql+" where";
			}
			baseSql= baseSql+" name="+serachCriteria.getName();
			count++;
		}
		 if(serachCriteria.getGender() != null) {
			if(count==0) {
				baseSql= baseSql+" where";
			}
			
			else {
				baseSql= baseSql+" and gender="+serachCriteria.getGender();
			}
			
			count++;
		}
		
		 if(serachCriteria.getDeptName() != null) {
			if(count==0) {
				baseSql= baseSql+" where";
			}
			else {
			baseSql= baseSql+" and dept_name="+serachCriteria.getDeptName();
			}
			count++;
		}
		
		 if(serachCriteria.getId() >0) {
			if(count==0) {
				baseSql= baseSql+" where";
			}
			else {
			baseSql= baseSql+" and id="+serachCriteria.getId();
			}
			count++;
		}
		
		
	}

}
