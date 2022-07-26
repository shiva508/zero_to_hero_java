package com.pool.l0.core.constructor;

public class CounstructorSuperChaining {

	public CounstructorSuperChaining() {
		this("Hi !,");
	}

	public CounstructorSuperChaining(String message1) {
		this(message1, "How Are You?");
	}

	public CounstructorSuperChaining(String message1, String message2) {
		System.out.println(message1+" "+message2);
	}
}
