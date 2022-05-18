package com.pool.l1.thread.v1.threadcreation.execirsise;

public class TestThread {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("THREAD 1");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("THREAD 2");
			}
		});

		thread.start();
		thread2.start();
		System.out.println("MAin thread");
	}
}
