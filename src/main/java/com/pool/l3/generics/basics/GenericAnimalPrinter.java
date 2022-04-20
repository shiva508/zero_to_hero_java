package com.pool.l3.generics.basics;

import java.io.Serializable;

public class GenericAnimalPrinter<T extends Animal> {
	T userId;

	public GenericAnimalPrinter(T userId) {
		this.userId = userId;
	}

	public void printDetails() {
		System.out.println(this.userId);
	}
}
