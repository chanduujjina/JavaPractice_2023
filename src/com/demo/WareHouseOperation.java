package com.demo;

public class WareHouseOperation {
	
	private String activityName;
	private String activityType;
	private String activityOwner;

	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityType() {
		return activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getActivityOwner() {
		return activityOwner;
	}
	public void setActivityOwner(String activityOwner) {
		this.activityOwner = activityOwner;
	}
	
	@Override
	public String toString() {
		return "WareHouseOperation [activityName=" + activityName + ", activityType=" + activityType
				+ ", activityOwner=" + activityOwner + "]";
	}
}
