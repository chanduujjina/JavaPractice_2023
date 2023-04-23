package com.demo.oops.inheritance;

public class BaseForm {
	
	private int formId;
	
	private String formName;
	
	private String formDescription;
	
	private String patientName;
	
	private String gender;
	
	private String screeningNumber;
	
	
	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFormDescription() {
		return formDescription;
	}

	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}
	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getScreeningNumber() {
		return screeningNumber;
	}

	public void setScreeningNumber(String screeningNumber) {
		this.screeningNumber = screeningNumber;
	}

}
