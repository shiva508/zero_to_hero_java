package com.pool.l1.util.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeClient {
	public static void main(String[] args) {
		arrayDequeImplementation();
		linkenListImplementaion();
	}

	private static void linkenListImplementaion() {
		Deque<String> linkedList=new LinkedList<>();
		linkedList.add("Shiva");
		linkedList.add("Nithya");
		linkedList.add("Satish");
		linkedList.add("Ravi");
	}

	private static void arrayDequeImplementation() {
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Shiva");
		arrayDeque.add("Nithya");
		arrayDeque.add("Satish");
		arrayDeque.add("Ravi");
	}
}
