package com.demo;

public class LogisticOperation extends WareHouseOperation {

	private String vehicleNumber;
	private String destinationName;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	@Override
	public String toString() {
		return "LogisticOperation [vehicleNumber=" + vehicleNumber + ", destinationName=" + destinationName + "]";
	}
	
	
}
