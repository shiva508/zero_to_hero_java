package com.pool.thread.book.partical;

public class UnsafeSequence {
	private int value;

	public int getValue() {
		return value++;
	}
}
