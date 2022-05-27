package com.pool.l1.thread.v2.producerconsumer;

import java.util.ArrayList;
import java.util.List;

class BunFactory {
	private List<Integer> list = new ArrayList<>();
	private static final int UPPER_LIMIT = 5;
	private static final int LOWER_LIMIT = 0;
	private int value = 0;
	private final Object lock = new Object();

	public void producer() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == UPPER_LIMIT) {
					System.out.println("Waiting for removing items...");
					lock.wait();
				} else {
					System.out.println("Adding value:" + value);
					list.add(value);
					value++;
					lock.notify();
				}
				Thread.sleep(500);
			}
		}
	}

	public void consumer() throws InterruptedException {
		synchronized (lock) {
			while (true) {
				if (list.size() == LOWER_LIMIT) {
					System.out.println("Waiting for Adding items...");
					lock.wait();
				} else {
					System.out.println("Removing value:" + list.remove(list.size() - 1));
					value--;
					lock.notify();
				}
				Thread.sleep(500);
			}
		}
	}
}

public class ProducerConsumerClient {
	public static void main(String[] args) {
		BunFactory bunFactory = new BunFactory();
		Thread thread1 = new Thread(() -> {
			try {
				bunFactory.producer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread thread2 = new Thread(() -> {
			try {
				bunFactory.consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread1.start();
		thread2.start();
	}
}
