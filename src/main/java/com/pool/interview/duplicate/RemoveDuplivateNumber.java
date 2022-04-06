package com.pool.interview.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplivateNumber {
	public static void main(String[] args) {
		List<Number> input = Arrays.asList(1.3, 4, 3, 5, 4);
		List<Integer> inputData = new ArrayList<>();
		List<Number> integerDta = removeDuplicateValues(input);
		System.out.println(integerDta);
		List<Integer> integerJava8 = removeDuplicateValuesJava8(inputData);
		System.out.println(integerJava8);

	}

	private static <T> List<T> removeDuplicateValuesJava8(List<T> duplicateData) {
		return (List<T>) duplicateData.stream().distinct();
	}

	private static <T> List<T> removeDuplicateValues(List<T> duplicateData) {
		List<T> distinctData = new ArrayList<>();

		for (T t : duplicateData) {
			if (!distinctData.contains(t)) {
				distinctData.add(t);
			}
		}
		return distinctData;
	}
}
