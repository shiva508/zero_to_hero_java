package com.pool.l1.util.cmr.set;

import java.util.LinkedHashSet;

public class LinkedHashSetClient {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("D");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		
		for (String alpa : linkedHashSet) {
			System.out.println(alpa);
		}
	}
}
