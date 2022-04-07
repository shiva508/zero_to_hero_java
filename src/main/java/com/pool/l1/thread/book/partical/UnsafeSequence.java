package com.pool.l1.thread.book.partical;

public class UnsafeSequence {
	private int value;

	public int getValue() {
		return value++;
	}
}
