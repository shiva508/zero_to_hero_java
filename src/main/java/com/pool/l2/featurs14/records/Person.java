package com.pool.l2.featurs14.records;

public record Person(String name, String address) {
	public String connverToUpperCase() {
		return name.toUpperCase();
	}
	public static void printStaticData() {
		System.out.println("OMY");
	}
	
}