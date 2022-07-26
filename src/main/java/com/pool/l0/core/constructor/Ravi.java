package com.pool.l0.core.constructor;

public class Ravi {
	private String name;
	private int age;

	public Ravi() {
		this("Ravi");
		System.out.println("Default constructor called");
	}

	public Ravi(String name) {
		this(20);
		this.name = name;
		System.out.println("NAME constructor is called");
	}

	public Ravi(int age) {
		this("Ravi",20);
		this.age = age;
		System.out.println("AGE constructor is called");
		
	}

	public Ravi(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("NAME,AGE constructor is called");
	}

}
