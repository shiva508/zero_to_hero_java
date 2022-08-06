package com.pool.l2.featurs8.functionalcoding;

import java.util.stream.IntStream;

public class PrimeNumberClientFunctional {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(i -> System.out.printf("isPrimeNumber(%d)? %b\n", i, isPrimeNumber(i)));

	}

	public static boolean isPrimeNumber(int input) {
		return input > 1 && IntStream.range(2, input).noneMatch(i -> input % i == 0);
	}
}
