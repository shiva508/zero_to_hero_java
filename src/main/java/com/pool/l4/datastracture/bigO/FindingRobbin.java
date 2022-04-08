package com.pool.l4.datastracture.bigO;

import java.util.Arrays;
import java.util.List;

public class FindingRobbin {
	public static void main(String[] args) {
		// String[] batmanAssociates1 = new String[1000];
		// Arrays.fill(batmanAssociates1, "SHIVA");
		// robbinSearch();
		// bigOone(batmanAssociates1);
		// bigOoneChallenge(batmanAssociates1);
		// logAllPairOfNumbers();
		dropNonDoominant();
	}

	private static void anotherFunChallenge(String[] input) {
		var a = 5;// O(1)
		var b = 10;// O(1)
		var c = 50;// O(1)
		for (int i = 0; i < input.length; i++) {// O(n)
			var x = i + 1;// O(n)
			var y = i + 2;// O(n)
			var z = i + 3;// O(n)

		}
		for (int j = 0; j < input.length; j++) {// O(n)
			var p = j * 2;// O(n)
			var q = j * 2;// O(n)
		}
		var whoAmI = "I don't know";// O(1)

		// 4 O(1) +7 O(n)_
		// O(4+7n)
	}

	private static int bigOoneChallenge(String[] batmanAssociates1) {
		int usrid = 408;// O(1)
		usrid = 508 + 8;// O(1)
		for (int i = 0; i < batmanAssociates1.length; i++) {// O(n)
			bigOone(batmanAssociates1);// O(n)
			boolean makeItTrue = true;// O(n)
			usrid++;// O(n)
		}
		return usrid;// O(1)

		// BIG O(3+n+n+n+n)==>O(3+4n)
	}

	private static void bigOone(String[] batmanAssociates1) {
		System.out.println(batmanAssociates1[0]);// O(1)

	}

	// O(n)
	private static void robbinSearch() {
		Long startTime = System.currentTimeMillis();
		String[] batmanAssociates1 = new String[1000];
		Arrays.fill(batmanAssociates1, "SHIVA");
		String[] batmanAssociates = { "A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "K",
				"Robbin" };

		for (int i = 0; i < batmanAssociates1.length; i++) {
			if (batmanAssociates1[i] == "SHIVA") {
				System.out.println("FOUND");
				break;
			}
		}

		Long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

	// REMOVING THE CONSTANTS
	private static void bigOoneRule2(String[] batmanAssociates1) {
		System.out.println(batmanAssociates1[0]);// O(1)
		var middleIndex = Math.floor(batmanAssociates1.length / 2);// O(1)
		int index = 0;// O(1)
		while (index < middleIndex) {// O(n/2)
			System.out.println(batmanAssociates1[index]);
			index++;
		}
		for (int i = 0; i < 100; i++) {// 100
			System.out.println("Hey there");
		}
		// O(1+n/2+100)==>O(n)=====>after removing constants
	}

	// DIFFERENT INPUTS
	public void differntInputs(List<String> input1, List<String> input2) {
		input1.forEach(data -> {// O(a)
			System.out.println(data);
		});
		input2.forEach(data -> {// O(b)
			System.out.println(data);
		});

		// O(a+b)
	}

	// LOG ALL PAIR OF NUMBERS

	public static void logAllPairOfNumbers() {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < input.length; i++) { // O(n)
			for (int j = 0; j < input.length; j++) {// O(n)
				System.out.println("I={" + input[i] + "," + input[j] + "}");
			}
		}

		// O(n*n)===>O(n^2)
	}

	// RULE4:Drop the non dominant

	public static void dropNonDoominant() {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < input.length; i++) {//O(n)
			System.out.println(input[i]);
		}

		for (int i = 0; i < input.length; i++) { // O(n)
			for (int j = 0; j < input.length; j++) {// O(n)
				System.out.println("SUM={" + input[i] + input[j] + "}");
			}
		}

		// O(n+ n*n)===>O(n+ n^2)=====>
	}

}
