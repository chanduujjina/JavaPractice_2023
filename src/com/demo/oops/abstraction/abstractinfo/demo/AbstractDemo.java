package com.demo.oops.abstraction.abstractinfo.demo;

import com.demo.oops.abstraction.abstractinfo.ATT;
import com.demo.oops.abstraction.abstractinfo.Carrier;
import com.demo.oops.abstraction.abstractinfo.TMobile;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Carrier carrier = new ATT();
		String simSize = carrier.simSize();
		System.out.println(simSize);
		
		String carrierPlan = carrier.getCarrierPlan();
		System.out.println(carrierPlan);
		
		Carrier carrier2 = new TMobile();
        System.out.println(carrier2.getCarrierPlan());	
        
        System.out.println(carrier2.simSize());		
 
	}

}
