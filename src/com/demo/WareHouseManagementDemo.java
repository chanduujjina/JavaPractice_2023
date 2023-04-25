package com.demo;

public class WareHouseManagementDemo {

	public static void main(String[] args) {
		
		
		  InHouseOperation inHouseOperation = new InHouseOperation();
		  inHouseOperation.setActivityName("Test");
		  inHouseOperation.setActivityOwner("DTDC");
		  inHouseOperation.setActivityType("Logistics");
		  inHouseOperation.setLoc("LOC");
		  inHouseOperation.setTypeOfStorage("storage");
		  
		 
		  System.out.println(inHouseOperation.toString());
		  System.out.println(inHouseOperation.getActivityName());
		  System.out.println(inHouseOperation.getActivityOwner());
		  System.out.println(inHouseOperation.getActivityType());
		 
		
		
		
		LogisticOperation logisticOperation= new LogisticOperation();
		logisticOperation.setActivityName("Test");
		logisticOperation.setActivityOwner("DHL");
		logisticOperation.setActivityType("Logistics1");
		logisticOperation.setDestinationName("LOC1");
		logisticOperation.setVehicleNumber("storage1");
		 System.out.println(logisticOperation.toString());
		  System.out.println(logisticOperation.getActivityName());
		  System.out.println(logisticOperation.getActivityOwner());
		  System.out.println(logisticOperation.getActivityType());
		 
	}

}
