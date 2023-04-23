package com.demo.oops.inheritance;

public class ContractEmployee  extends Employee {
	
	private String payRoleName;
	private int contractPeriod;
	private boolean cabFacility;
	public String getPayRoleName() {
		return payRoleName;
	}
	public void setPayRoleName(String payRoleName) {
		this.payRoleName = payRoleName;
	}
	public int getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public boolean isCabFacility() {
		return cabFacility;
	}
	public void setCabFacility(boolean cabFacility) {
		this.cabFacility = cabFacility;
	}
	@Override
	public String toString() {
		return "ContractEmployee [payRoleName=" + payRoleName + ", contractPeriod=" + contractPeriod + ", cabFacility="
				+ cabFacility + "]";
	}
	
	
	

}
