package com.pool.l1.thread.v2.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableCilent {
	private static AtomicInteger counter = new AtomicInteger(0);

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			increament();
		});
		Thread thread2 = new Thread(() -> {
			increament();
		});
		thread1.start();
		thread2.start();
		try {
			thread2.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Final count:" + counter);
	}

	public static void increament() {
		for (int i = 0; i < 1000; i++) {
			counter.getAndIncrement();
		}

	}
}
