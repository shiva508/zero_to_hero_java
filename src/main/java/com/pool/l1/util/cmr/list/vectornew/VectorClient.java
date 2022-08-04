package com.pool.l1.util.cmr.list.vectornew;

import java.util.Vector;

public class VectorClient {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("A");
		vector.add("B");
		vector.add(null);
		vector.add(null);
		for(String names:vector) {
			System.out.println(names);
		}
	}
}
