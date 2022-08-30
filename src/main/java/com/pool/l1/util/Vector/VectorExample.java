package com.pool.l1.util.Vector;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<>();
		processVectorAdd(vector);
		System.out.println(vector);
	}

	/**
	 * @param vector
	 */
	public static void processVectorAdd(Vector<Object> vector) {
		vector.add(1);
		vector.add("a");
		vector.addElement("Shiav");
	}
}
