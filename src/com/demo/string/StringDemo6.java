package com.demo.string;

public class StringDemo6 {

	public static void main(String[] args) {
		
		//join method
		
	String joinVal = String.join("/", "08","04","2023");
	
	System.out.println(joinVal);
	
	//how to compare String with prefix and suffix
	
     String bankIfscodes []= {"SBIN0021","ICICI0021","HDFC0012"};
     
     //get sbi ifsc code
     
     for(String ifscCode :bankIfscodes) {
    	 
    	 if(ifscCode.startsWith("SBI")) {
    		 System.out.println("its sbi bank");
    	 }
    	 else if(ifscCode.startsWith("ICICI")) {
    		 System.out.println("its sbi bank");
    	 }
    	 
    	 else if(ifscCode.startsWith("HDFC")) {
    		 System.out.println("its hdfc bank");
    	 }
     }
     
     String nameList [] = {"chandu","Karthik","Bindu","Sindu"};
     
     //get names ends with du
     
     
     for(String name : nameList) {
    	 
    	 if(name.endsWith("du")) {
    		 System.out.println(name);
    	 }
     }
	
	/*
	 * employee id :2512699
	 * Dob :13/05/1993
	 * gender M
	 * employeeId|dob|M
	 * 2512699|13/05/1993|M
	 */
     
     Employee employee= new Employee("chandu", 2512699L, "13/05/1993", "M");
     
     String val = String.join("|",String.valueOf(employee.getEmployeeId()),employee.getDob(),employee.getGender());
     System.out.println(val);

	}

}
