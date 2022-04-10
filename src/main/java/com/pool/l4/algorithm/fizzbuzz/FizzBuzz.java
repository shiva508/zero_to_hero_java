package com.pool.l4.algorithm.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		Integer[] fizzBuzzFeed = { 1, 2, 3, 4, 5 };
		lessInputRange(fizzBuzzFeed);
		Integer[] fizzBuzzFeed2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		moreInputRange(fizzBuzzFeed2);
		moreInputRangeEfficient(fizzBuzzFeed2);
	}

	private static void moreInputRangeEfficient(Integer[] fizzBuzzFeed) {
		for (int i = 0; i < fizzBuzzFeed.length; i++) {
			if (fizzBuzzFeed[i] % 15 == 0) {
				System.out.println("FIZZZ BUZZ");
			} else if (fizzBuzzFeed[i] % 3 == 0) {
				System.out.println("FIZZZ");
			} else if (fizzBuzzFeed[i] % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(fizzBuzzFeed[i]);
			}
		}

	}

	private static void lessInputRange(Integer[] fizzBuzzFeed) {
		for (int i = 0; i < fizzBuzzFeed.length; i++) {
			if (fizzBuzzFeed[i] % 3 == 0) {
				System.out.println("FIZZZ");
			} else if (fizzBuzzFeed[i] % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(fizzBuzzFeed[i]);
			}
		}
	}

	private static void moreInputRange(Integer[] fizzBuzzFeed) {
		for (int i = 0; i < fizzBuzzFeed.length; i++) {
			if (fizzBuzzFeed[i] % 3 == 0 && fizzBuzzFeed[i] % 5 == 0) {
				System.out.println("FIZZZ BUZZ");
			} else if (fizzBuzzFeed[i] % 3 == 0) {
				System.out.println("FIZZZ");
			} else if (fizzBuzzFeed[i] % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(fizzBuzzFeed[i]);
			}
		}
	}
}
