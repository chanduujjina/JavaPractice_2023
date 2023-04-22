package com.demo.oops;

public class Employee {
	
	public Employee() {
		
	}
	//4 paremetrs
	public Employee(int eid,String eName,String gender,String dept) {
		this(eid,gender);
		this.eid=eid;
		this.eName=eName;
		this.gender=gender;
		this.dept=dept;
		
	}
	
	//2 parametorized constrcor
	public Employee(int eid,String gender) {
		this.eid=eid;
		this.eName=eName;
	}
	
	
	
	
   @Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", gender=" + gender + ", dept=" + dept + "]";
	}

   public void setEid(int eid) {
	   this.eid= eid;
   }
   
   public int getEid() {
	   return eid;
   }
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

   private int eid;
   
   private String eName;
   
   private String gender;
   
   private String dept;

}
