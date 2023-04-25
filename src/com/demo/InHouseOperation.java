package com.demo;

public class InHouseOperation extends WareHouseOperation{
	
	private String loc;
	private String typeOfStorage;
	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTypeOfStorage() {
		return typeOfStorage;
	}
	public void setTypeOfStorage(String typeOfStorage) {
		this.typeOfStorage = typeOfStorage;
	}
	
	@Override
	public String toString() {
		return "InHouseOperation [loc=" + loc + ", typeOfStorage=" + typeOfStorage + "]";
	}
	

}
