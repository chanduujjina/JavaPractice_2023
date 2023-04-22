package com.demo.oops.inheritance.demo;

import com.demo.oops.inheritance.ADEForm;

public class InheritanceDemo4 {

	public static void main(String[] args) {
		
		ADEForm adeForm = new ADEForm();
		adeForm.setFormId(2);
		adeForm.setFormDescription("Needs to fill this when patient getting illness while applying drug");
		adeForm.setFormName("Adverse effect form");
		adeForm.setPatientName("test");
		adeForm.setGender("Male");
		adeForm.setScreeningNumber("SCR0001");
		adeForm.setProtocol("SCRp01");
		adeForm.setSegment("A");
		adeForm.setIllinesCause("Sever headche/stomoch ache due to drug dossage");
		
		System.out.println(adeForm.toString());
		System.out.println(adeForm.getFormName());
		
		
	}

}