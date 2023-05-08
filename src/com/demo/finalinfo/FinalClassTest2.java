package com.demo.finalinfo;

public  class FinalClassTest2 {
	
	public void m1() {
		System.out.println("inside m1 method FinalClassTest2");
	}
	
	public final void m2() {
		System.out.println("inside m1 method FinalClassTest2");
	}
	

}


class SubClass extends FinalClassTest2{
	
	@Override
	public void m1() {
		System.out.println("inside m1 method SubClass");
	}
	
	/*@Override-->You cannot override the final method
	public  void m2() {
		System.out.println("inside m1 method FinalClassTest2");
	}*/
	
}
