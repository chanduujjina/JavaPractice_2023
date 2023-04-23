package com.demo.oops.inheritance;

public class PermanentEmployee extends Employee{
	
	private int insuranceNumber;
	private boolean cabFacility;
	private String addressDetails;
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public boolean isCabFacility() {
		return cabFacility;
	}
	public void setCabFacility(boolean cabFacility) {
		this.cabFacility = cabFacility;
	}
	public String getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}
	@Override
	public String toString() {
		return "PermanentEmployee [insuranceNumber=" + insuranceNumber + ", cabFacility=" + cabFacility
				+ ", addressDetails=" + addressDetails + "]";
	}
	
	

}
