package com.demo.oops.aggregation;

public class TechStack {
	
	private String techSpecialization;
	private int exp;
	private boolean isAnyCertificationsDone;
	
	public boolean isAnyCertificationsDone() {
		return isAnyCertificationsDone;
	}
	public void setAnyCertificationsDone(boolean isAnyCertificationsDone) {
		this.isAnyCertificationsDone = isAnyCertificationsDone;
	}
	public String getTechSpecialization() {
		return techSpecialization;
	}
	public void setTechSpecialization(String techSpecialization) {
		this.techSpecialization = techSpecialization;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "TechStack [techSpecialization=" + techSpecialization + ", exp=" + exp + ", isAnyCertificationsDone="
				+ isAnyCertificationsDone + "]";
	}

}
