package com.demo.oops.aggregation;

public class Address {
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addressType=" + addressType + ", flotNo=" + flotNo + ", landMark="
				+ landMark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getFlotNo() {
		return flotNo;
	}

	public void setFlotNo(String flotNo) {
		this.flotNo = flotNo;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	private int addId;
	
	private String addressType;
	
	private String flotNo;
	private String landMark;
	
	private String city;
	
	private String state;
	
	private String pincode;

}
