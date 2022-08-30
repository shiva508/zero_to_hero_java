package com.pool.l1.util.queue.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueClient {
	public static void main(String[] args) {
		// Creating String type ArrayBlockingQueue with size 5
		ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

		// Creating Integer type ArrayBlockingQueue with size 5
		ArrayBlockingQueue<Integer> age = new ArrayBlockingQueue<>(5);
	}
}
