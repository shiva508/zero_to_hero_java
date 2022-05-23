package com.pool.l1.thread.v1.atomicreferance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public class StackClient {
	public static void main(String[] args) throws InterruptedException {
		// StandardStack<Integer> standardStack = new StandardStack<>();
		LockFreeSrack<Integer> standardStack = new LockFreeSrack<>();
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			standardStack.push(random.nextInt());
		}
		List<Thread> threads = new ArrayList<>();
		int pushingThreads = 2;
		int popingThreads = 2;
		for (int i = 0; i < pushingThreads; i++) {
			Thread thread = new Thread(() -> {
				while (true) {
					standardStack.push(random.nextInt());
				}
			});
			thread.setDaemon(true);
			threads.add(thread);
		}

		for (int i = 0; i < popingThreads; i++) {
			Thread thread = new Thread(() -> {
				while (true) {
					standardStack.pop();
				}
			});
			thread.setDaemon(true);
			threads.add(thread);
		}

		for (Thread data : threads) {
			data.start();
		}
		Thread.sleep(10000);
		System.out.println("Operations counter :" + standardStack.getCounter());
	}

	public static class LockFreeSrack<T> {
		private AtomicReference<StackNode<T>> head = new AtomicReference<>();
		private AtomicInteger counter = new AtomicInteger();

		public void push(T value) {
			StackNode<T> newHeadNode = new StackNode<>(value);
			while (true) {
				StackNode<T> currentHeadNode = head.get();
				newHeadNode.next = currentHeadNode;
				if (head.compareAndSet(currentHeadNode, newHeadNode)) {
					break;
				} else {
					LockSupport.parkNanos(1);
				}
			}
			counter.incrementAndGet();
		}

		public T pop() {
			StackNode<T> currentHeadNode = head.get();
			StackNode<T> newHeadNode;
			while (currentHeadNode != null) {
				newHeadNode = currentHeadNode.next;
				if (head.compareAndSet(currentHeadNode, newHeadNode)) {
					break;
				} else {
					LockSupport.parkNanos(1);
					currentHeadNode = head.get();
				}
			}
			counter.incrementAndGet();
			return currentHeadNode != null ? currentHeadNode.value : null;
		}

		public int getCounter() {
			return counter.get();
		}
	}

	public static class StandardStack<T> {
		private StackNode<T> head;
		private int counter = 0;

		public synchronized void push(T value) {
			StackNode<T> newHead = new StackNode<>(value);
			newHead.next = head;
			head = newHead;
			counter++;
		}

		public synchronized T pop() {
			if (head == null) {
				counter++;
				return null;
			}
			T value = head.value;
			head = head.next;
			counter++;
			return value;
		}

		public int getCounter() {
			return counter;
		}
	}

	private static class StackNode<T> {
		private T value;
		private StackNode<T> next;

		public StackNode(T value) {
			this.value = value;
			this.next = next;
		}
	}
}
