package com.demo.finalinfo;

public final class FinalClassTest {
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	private final int id;
	
	
	private final String name;
	
	private String type;
	
	public FinalClassTest(int id,String name) {
		this.id= id;
		this.name=name;
	}
	
	public void m1() {
		//id=1;This line will give compilation error because you cannot reintiailze final vraible
	}
	
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

	
	public static void main(String[] args) {
		FinalClassTest finalClassTest = new FinalClassTest(1, "Test");
		System.out.println(finalClassTest);
		finalClassTest.setType("test type");
		System.out.println(finalClassTest);
		
	}

}





/*class SubClass extends FinalClassTest{// compilation error becuase you cannot extends (inherit) final class
	
}*/
