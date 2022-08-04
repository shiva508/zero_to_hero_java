package com.pool.l1.util.cmr.set;

import java.util.TreeSet;

public class TreasetClient {
	public static void main(String[] args) {
		TreeSet<String> linkedHashSet = new TreeSet<>();
		linkedHashSet.add("D");
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		for (String alp : linkedHashSet) {
			System.out.println(alp);
		}
	}
}
