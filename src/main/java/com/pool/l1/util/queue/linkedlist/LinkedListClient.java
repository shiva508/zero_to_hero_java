package com.pool.l1.util.queue.linkedlist;

import java.util.LinkedList;

public class LinkedListClient {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.offer(1);
		linkedList.add(11);
		linkedList.offer(2);
	}
}
