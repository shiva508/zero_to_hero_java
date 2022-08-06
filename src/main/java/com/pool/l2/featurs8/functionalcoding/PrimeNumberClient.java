package com.pool.l2.featurs8.functionalcoding;

public class PrimeNumberClient {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("isPrimeNumber(%d)? %b\n", i, isPrimeNumber(i));
		}
	}

	public static boolean isPrimeNumber(int input) {
		boolean divisable = false;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				divisable = true;
				break;
			}
		}
		return input > 1 && !divisable;
	}
}
