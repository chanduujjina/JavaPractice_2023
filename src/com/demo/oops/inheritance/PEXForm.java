package com.demo.oops.inheritance;

public class PEXForm extends BaseForm {

	private double weight;
	
	private double height;
	
	private int bmi;
	
	private int bpcount;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getBmi() {
		return bmi;
	}

	public void setBmi(int bmi) {
		this.bmi = bmi;
	}

	public int getBpcount() {
		return bpcount;
	}

	public void setBpcount(int bpcount) {
		this.bpcount = bpcount;
	}
	
	@Override
	public String toString() {
		return "PEXForm [weight=" + weight + ", height=" + height + ", bmi=" + bmi + ", bpcount=" + bpcount + "]";
	}

}
