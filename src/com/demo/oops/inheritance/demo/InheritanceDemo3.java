package com.demo.oops.inheritance.demo;

import com.demo.oops.inheritance.PEXForm;

public class InheritanceDemo3 {

	public static void main(String[] args) {
		//with super class reference you can hold subclass object
		//BaseForm baseForm = new PEXForm();
		
		PEXForm pexForm = new PEXForm();
		pexForm.setFormId(1);
		pexForm.setFormName("Phisical examination form");
		pexForm.setFormDescription("This form deals with phisical examinations results validation for the patient");
		pexForm.setPatientName("Test");
		pexForm.setScreeningNumber("SCR0001");
		
		pexForm.setHeight(5.6);
		pexForm.setWeight(60.5);
		pexForm.setBmi(10);
		pexForm.setBpcount(110);
		
		System.out.println(pexForm.toString());
		
		System.out.println(pexForm.getFormName());
		System.out.println(pexForm.getFormId());
		
       
	}

}