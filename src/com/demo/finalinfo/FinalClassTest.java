package com.demo.finalinfo;

public final class FinalClassTest {
	
	@Override
	public String toString() {
		return "FinalClassTest [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private final int id;
	
	
	private final String name;
	
	public FinalClassTest(int id,String name) {
		this.id= id;
		this.name=name;
	}
	
	public void m1() {
		//id=1;This line will give compilation error because you cannot reintiailze final vraible
	}
	
	public static void main(String[] args) {
		FinalClassTest finalClassTest = new FinalClassTest(1, "Test");
		System.out.println(finalClassTest);
	}

}


/*class SubClass extends FinalClassTest{// compilation error becuase you cannot extends (inherit) final class
	
}*/
