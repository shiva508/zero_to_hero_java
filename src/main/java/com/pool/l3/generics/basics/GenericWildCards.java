package com.pool.l3.generics.basics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		printWildData(integers);
		List<Cat> cats = new ArrayList<>();
	}

	public static void printData(List<Object> data) {

	}

	public static void printWildData(List<?> data) {

	}

}
