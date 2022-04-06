package com.pool.core.fundamentals.accessspecifiers;

public class Test {
	{
		System.out.println("INSTANCE BLOCK");
	}
	static {
		System.out.println("STATIC BLOCK");
	}

	public static void ststivMethod() {
		System.out.println("STATIC METHOD");
	}

	public void instanceMethod() {
		System.out.println("INSTANCE METHOD");
	}
	public Test() {
		System.out.println("CONSTRUCTOR");
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		Test.ststivMethod();
		test.instanceMethod();
	}
}
