package com.pool.l1.thread.v2.memorymanagement;

public class SynchronizationClient {
	public static int counter = 0;

	public static synchronized void increament() {
		counter++;
	}

	public static void process() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increament();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increament();
				}
			}
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
		System.out.println("Counte:" + counter);
	}

	public static void main(String[] args) {
		process();
	}
}
