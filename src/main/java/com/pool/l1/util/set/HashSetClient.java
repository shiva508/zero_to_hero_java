package com.pool.l1.util.set;

import java.util.HashSet;

public class HashSetClient {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("B");
		hashSet.add("C");
		System.out.println(hashSet.add("A"));
		System.out.println(hashSet.add("A"));
		System.out.println(hashSet);
	}
}
