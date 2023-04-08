package com.demo.arrayHandle;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		
		//create an employee array
		
		Employee employeeArray[] = new Employee[2];
		
		//create employee object1
		
		Employee emp1 = new Employee();
		
		emp1.setId(1);
		emp1.setName("Test1");
		
		     //create employee object2
		
				Employee emp2 = new Employee();
				
				emp2.setId(2);
				emp2.setName("Test2");
				
				employeeArray[0]=emp1;
				
				employeeArray[1]=emp2;
				
				//iterate and print array
				
				for(Employee emp :employeeArray) {
					System.out.println(emp.toString());
				}
				

	}

}



