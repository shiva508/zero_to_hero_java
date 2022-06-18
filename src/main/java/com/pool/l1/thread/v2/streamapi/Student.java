package com.pool.l1.thread.v2.streamapi;

public class Student {
	private String name;
	private boolean local;

	public Student(String name, boolean local) {
		this.name = name;
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", local=" + local + "]";
	}

}
