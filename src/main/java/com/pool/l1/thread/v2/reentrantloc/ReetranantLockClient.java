package com.pool.l1.thread.v2.reentrantloc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReetranantLockClient {
	private static int counter = 0;
	private static Lock lock = new ReentrantLock();

	private static void increament() {
		lock.lock();
		try {
			for (int i = 0; i < 10000; i++) {
				counter++;
			}
		} finally {
			lock.unlock();
		}

	}

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
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}
