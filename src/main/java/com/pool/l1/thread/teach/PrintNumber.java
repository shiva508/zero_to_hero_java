package com.pool.l1.thread.teach;

public class PrintNumber {

	public void printNumberSequence(String squalnceName) {
		for (int i = 0; i < 10000; i++) {
			System.out.println(squalnceName + ":" + i);
		}
	}
}
