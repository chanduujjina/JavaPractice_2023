package com.demo.oops.aggregation.demo;

import com.demo.oops.aggregation.Address;
import com.demo.oops.aggregation.Department;
import com.demo.oops.aggregation.Student;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Department department = new Department();
		
		department.setDepartName("ECE");
		department.setDeptId(1);
		department.setHodName("Test");
		department.setStudentCount(400);
		
		Address address1 = new Address();
		address1.setAddId(1);
		address1.setFlotNo("1-112");
		address1.setLandMark("Nest Bakery");
		address1.setCity("Bangalore");
		address1.setState("karntaka");
		address1.setPincode("12345");
		address1.setAddressType("Present");
		
		Address address2 = new Address();
		address2.setAddId(2);
		address2.setFlotNo("2-112");
		address2.setLandMark("Brodipet");
		address2.setCity("Guntur");
		address2.setState("AP");
		address2.setPincode("12345");
		address2.setAddressType("Perment");
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Chandu");
		
		Address addressArray [] = new Address[2];
		addressArray[0] = address1;
		addressArray[1] = address1;
		
		student.setAddress(addressArray);
		
		student.setDepartment(department);
		
		System.out.println(student);
		
		for(Address add :addressArray) {
			System.out.println(add.toString());
		}
		
		//System.out.println(student.getAddress());
		
		//System.out.println(student.getDepartment());
		
		
	}

}
