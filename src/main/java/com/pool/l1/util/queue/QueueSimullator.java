package com.pool.l1.util.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSimullator {
	public static void main(String[] args) {
		queueBasicOperation();
		queueBasicOperationPriorityQueue();
	}

	private static void queueBasicOperation() {
		Queue<String> queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.offer("F");
		System.out.println(queue);
		// REMOVE THE QUEUE
		queue.remove("C");
		System.out.println(queue);
		System.out.println("===========================================");
	}

	private static void queueBasicOperationPriorityQueue() {

		Queue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("A");
		priorityQueue.add("B");
		priorityQueue.add("C");
		priorityQueue.add("D");
		priorityQueue.add("E");
		priorityQueue.offer("F");

		String peek = priorityQueue.peek();
		System.out.println("peek:" + peek);

		String pool = priorityQueue.poll();
		System.out.println("pool:" + pool);

		System.out.println(priorityQueue);
		// REMOVE THE QUEUE
		priorityQueue.remove("C");
		System.out.println(priorityQueue);
	}
}
