package com.pool.string.concatoperation;

public class StringConcatOperation {
	public static void main(String[] args) {
		String cancatData = "Shiva";
		System.out.println(cancatData.hashCode());
		cancatData += " Shiva";
		System.out.println(cancatData.hashCode());
		System.out.println(cancatData);
	}
}
