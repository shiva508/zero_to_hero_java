package com.pool.l5.interview.StringIsNumeric;

public class StringIsNumericClient {
	public static void main(String[] args) {
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
		System.out.println(isNumeric(null));
		System.out.println(isNumeric("1,200"));
		System.out.println(isNumeric("1"));
		System.out.println(isNumeric("200"));
		System.out.println(isNumeric("3000.00"));

		System.out.println("===================================");
		System.out.println(isNumericUsingJava8(""));
		System.out.println(isNumericUsingJava8(" "));
		System.out.println(isNumericUsingJava8(null));
		System.out.println(isNumericUsingJava8("1,200"));
		System.out.println(isNumericUsingJava8("1"));
		System.out.println(isNumericUsingJava8("200"));
		System.out.println(isNumericUsingJava8("3000.00"));
	}

	private static boolean isNumericUsingJava8(String inputText) {
		if (inputText == null || inputText.length() == 0) {
			return false;
		}
		return inputText.chars().allMatch(Character::isDigit);
	}

	private static boolean isNumeric(String inputText) {
		if (inputText == null || inputText.length() == 0) {
			return false;
		}

		for (char text : inputText.toCharArray()) {
			if (!Character.isDigit(text)) {
				return false;
			}
		}
		return true;
	}
}
