package com.demo.oops.aggregation;

public class Department {
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", departName=" + departName + ", hodName=" + hodName
				+ ", studentCount=" + studentCount + "]";
	}

	private int deptId;
	
	private String departName;
	
	private String hodName;
	
	private int studentCount;
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}


}
