package com.demo.oops.aggregation;

public class Company {
	 
	private String companyName;
	private String companyLocation;
	private boolean isMncCompany;
	private int teamCount;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public boolean isMncCompany() {
		return isMncCompany;
	}
	public void setMncCompany(boolean isMncCompany) {
		this.isMncCompany = isMncCompany;
	}
	public int getTeamCount() {
		return teamCount;
	}
	public void setTeamCount(int teamCount) {
		this.teamCount = teamCount;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", isMncCompany="
				+ isMncCompany + ", teamCount=" + teamCount + "]";
	}
	
	
	

}
