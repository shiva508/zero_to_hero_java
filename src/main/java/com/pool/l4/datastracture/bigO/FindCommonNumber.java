package com.pool.l4.datastracture.bigO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonNumber {
	public static void main(String[] args) {
		String[] input1 = { "a", "b", "c", "x" };
		String[] input2 = { "z", "y", "e" };
		// return flase
		String[] input3 = { "a", "b", "c", "x" };
		String[] input4 = { "z", "y", "x" };
		boolean isCharfound = isNumberFound(input1, input2);// O(n*b)
		System.out.println(isCharfound);
		boolean isCharfound1 = isNumberFound(input3, input4);// O(n*b)
		System.out.println(isCharfound1);
		// boolean isCharfound3 = isNumberFoundBetterApproch(input3, input4);// O(n*b)
		isNumberFoundBetterApprochJava8(input1, input2);
		isNumberFoundBetterApprochJava8(input3, input4);

	}

	private static void isNumberFoundBetterApprochJava8(String[] input3, String[] input4) {
		List<String> inputFeed = Arrays.asList(input3);
		List<String> refFeed = Arrays.asList(input4);
		boolean isAvailable = inputFeed.stream().anyMatch(feed -> refFeed.contains(feed));
		System.out.println(isAvailable);

	}

	private static boolean isNumberFoundBetterApproch(String[] input3, String[] input4) {
		Map<String, Boolean> bash = new HashMap<>();
		for (int i = 0; i < input3.length; i++) {
			if (!bash.containsKey(input3[i])) {
				bash.put(input3[i], true);
			}
		}
		System.out.println(bash);
		for (int j = 0; j < input4.length; j++) {
			if (bash.get(input4[j]) == true) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberFound(String[] input1, String[] input2) {
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if (input1[i].equalsIgnoreCase(input2[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
