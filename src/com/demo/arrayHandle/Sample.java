package com.demo.arrayHandle;

public class Sample {
	
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
	}


	public int getSampleId() {
		return sampleId;
	}


	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}


	public String getSampleName() {
		return sampleName;
	}


	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}


	private int sampleId;
	
	
	private String sampleName;

}
