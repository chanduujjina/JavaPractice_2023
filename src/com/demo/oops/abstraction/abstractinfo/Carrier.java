package com.demo.oops.abstraction.abstractinfo;

public abstract class Carrier {
	

	//concrete method
	public String simSize() {
		return CommonConstants._2_INCH;
	}
	
	public String simSize1() {
		return CommonConstants._2_INCH;
	}
	
	
	//abstract
	public abstract String getCarrierPlan();
	
	

}
