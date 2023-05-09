package com.demo.finalinfo;

public final class CusttomImmutbale {
	
	

	@Override
	public String toString() {
		return "CusttomImmutbale [value=" + value + ", type=" + type + ", id=" + id + ", stringBuffer=" + stringBuffer
				+ "]";
	}

	private final String value;
	
	private final String type;
	
	private final int id;
	
	
	//mutable reference in immutable object
	private final StringBuffer stringBuffer;
	
	public CusttomImmutbale(String value, String type, int id,StringBuffer stringBuffer) {
		super();
		this.value = value;
		this.type = type;
		this.id = id;
		//Taking copy from original reference
		StringBuffer stringBufferTemp = new StringBuffer(stringBuffer.toString());
		this.stringBuffer=stringBufferTemp; 
	}
	
	
	public String getValue() {
		return value;
	}

	public String getType() {
		return type;
	}

	public int getId() {
		return id;
	}
	
	public StringBuffer getStringBuffer() {
		
		//Taking copy from original reference
		StringBuffer stringBufferTemp = new StringBuffer(stringBuffer.toString());
		return stringBufferTemp;
	}


}
