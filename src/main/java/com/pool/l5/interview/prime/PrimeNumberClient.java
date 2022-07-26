package com.pool.l5.interview.prime;

import java.util.Iterator;

public class PrimeNumberClient {

	// Number is prime number if is divided by 1 and it self
	public static void main(String[] args) {
		int number = 11;
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			int remainder = number % i;
			if (remainder == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			System.out.println("Number is prime number");
		} else {
			System.out.println("Number is Not prime number");
		}
	}

	private static int isPalindrome(String input1) {
		int j = input1.length();
		for (int i = 0; i < input1.length() / 2; i++) {
			char ch = input1.charAt(i);
			if (ch != input1.charAt(j - 1))
				return 0;
			j--;
		}
		return 1;
	}
}
