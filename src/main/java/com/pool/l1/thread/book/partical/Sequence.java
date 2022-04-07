package com.pool.l1.thread.book.partical;

public class Sequence {
	private int value;

	public synchronized int nextValue() {
		return value++;
	}
}
