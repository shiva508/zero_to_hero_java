package com.pool.interview.numbersequence;


public class NumberSequenceClient {
	public static void main(String[] args) {
		processNumberSequence();
	}

	private static void processNumberSequence() {

		for (int i = 0; i < 5; i++) {
			int squenceNumber=(int)Math.pow(2, i);
			System.out.println(squenceNumber);
			
			System.out.println(Math.sqrt(i));
			
		}
	}
}
