package com.demo.arrayHandle;

import java.util.Objects;

public class Sample implements Cloneable {
	
	@Override
	public int hashCode() {
		return Objects.hash(sampleId, sampleName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return sampleId == other.sampleId && Objects.equals(sampleName, other.sampleName);
	}
	
	@Override
	 public  Object clone() throws CloneNotSupportedException {
		return super.clone();
		 
	 }


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
