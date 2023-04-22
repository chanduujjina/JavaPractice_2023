package com.demo.oops.inheritance;

public class ADEForm extends BaseForm {
	
	private String drugName;
	
	private String protocol;
	
	private String segment;
	
	private String illinesCause;
	
	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getIllinesCause() {
		return illinesCause;
	}

	public void setIllinesCause(String illinesCause) {
		this.illinesCause = illinesCause;
	}
	
	@Override
	public String toString() {
		return "ADEForm [drugName=" + drugName + ", protocol=" + protocol + ", segment=" + segment + ", illinesCause="
				+ illinesCause + "]";
	}

}
