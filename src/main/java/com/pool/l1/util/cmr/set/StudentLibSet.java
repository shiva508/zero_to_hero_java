package com.pool.l1.util.cmr.set;

import java.util.HashSet;
import java.util.Set;

public class StudentLibSet {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		for (int i = 0; i < 100; i++) {
			names.add("A");
		}
		System.out.println(" Size:"+names.size());
		
		for (int i = 0; i < 100; i++) {
			names.add("A"+i);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
