package com.pool.l3.generics.basics;

import java.io.Serializable;

public class GenericInterfacePrinter<T extends Animal & Serializable> {
	T userId;

	public GenericInterfacePrinter(T userId) {
		this.userId = userId;
	}

	public void printDetails() {
		System.out.println(this.userId);
	}
}
