package com.pool.l1.util.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueClient {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(10);
		priorityQueue.offer(1);
		priorityQueue.add(11);
		priorityQueue.offer(2);
		System.out.println("Inserted Data:"+priorityQueue);
	}
}
