package com.pool.l5.interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayNumber {
	public static void main(String[] args) {
		int[] inputData = { 2, 10, 7, 40, 9, 4 };

		Predicate<Integer> predicate = num -> num % 10 == 0;
		List<Integer> inputDataList = Arrays.stream(inputData).boxed().collect(Collectors.toList());
		int nonTenDivLenght = 0;
		int tenDivLength = 0;

		for (int i = 0; i < inputData.length; i++) {
			if (inputData[i] % 10 == 0) {
				tenDivLength++;
			} else {
				nonTenDivLenght++;
			}
		}
		System.out.println(tenDivLength);
		System.out.println(nonTenDivLenght);

		int[] tenDivArray = new int[tenDivLength];
		int[] nonTenDivArray = new int[nonTenDivLenght];
		int[] finalArray = new int[inputData.length];

		for (int i = 0; i < inputData.length; i++) {
			if (nonTenDivArray.length < i) {

			} else {

			}

			if (inputData[i] % 10 == 0) {
				int a = inputData[i];
				int b = inputData[i + 1];
				inputData[i] = b;
				inputData[i + 1] = a;

			}

		}

		// beforeJava8(predicate, inputDataList);

		// usingPartionedBy(predicate, inputDataList);

		// groupingBy(inputDataList);

	}

	private static void groupingBy(List<Integer> inputDataList) {
		List<List<Integer>> groupingBy = new ArrayList<>(
				inputDataList.stream().collect(Collectors.groupingBy(num -> num % 10 == 0)).values());
		System.out.println(groupingBy);
	}

	private static void usingPartionedBy(Predicate<Integer> predicate, List<Integer> inputDataList) {
		List<List<Integer>> partationedList = new ArrayList<>(
				inputDataList.stream().collect(Collectors.partitioningBy(predicate)).values());
		System.out.println(partationedList);
	}

	private static void beforeJava8(Predicate<Integer> predicate, List<Integer> inputDataList) {
		List<Integer> divisableBy10 = inputDataList.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(divisableBy10);
		List<Integer> nonDivisableBy10 = inputDataList.stream().filter(predicate.negate()).collect(Collectors.toList());
		System.out.println(nonDivisableBy10);
		List<Integer> finalList = new ArrayList<>();
		finalList.addAll(nonDivisableBy10);
		finalList.addAll(divisableBy10);
		System.out.println(finalList);
	}
}
