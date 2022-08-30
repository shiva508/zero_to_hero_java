package com.pool.l1.util.queue.blockingqueue.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueClient {
	public static void main(String[] args) {
		// Creating String type LinkedBlockingQueue with size 5
		LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);

		// Creating Integer type LinkedBlockingQueue with size 5
		LinkedBlockingQueue<Integer> age = new LinkedBlockingQueue<>(5);
	}
}
