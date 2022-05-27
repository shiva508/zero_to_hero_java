package com.pool.l1.thread.v2.lock.customobject;

public class SynchronizationCustomObjectLockClient {
	public static int counter1 = 0;
	public static int counter2 = 0;

	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static synchronized void increament1() {
		synchronized (lock1) {
			counter1++;
		}
	}

	public static void increament2() {
		synchronized (lock2) {
			counter2++;
		}
	}

	public static void process() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increament1();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increament2();
				}
			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counte1:" + counter1);
		System.out.println("Counte2:" + counter2);
	}

	public static void main(String[] args) {
		process();
	}
}
