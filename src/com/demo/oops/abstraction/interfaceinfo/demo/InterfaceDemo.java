package com.demo.oops.abstraction.interfaceinfo.demo;

import com.demo.oops.abstraction.interfaceinfo.Airtel;
import com.demo.oops.abstraction.interfaceinfo.Sim;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Sim sim = new Airtel();
		String simPlans = sim.getSimPlans();
		System.out.println(simPlans);
		
		boolean portable = sim.isPortable();
		System.out.println(portable);
		
		String simSize =sim.simSize;
		System.out.println(simSize);

	}

}
