package com.pool.l1.thread.v1.threadcreation;

public class RunnableThreadExceptionClient {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("we are now in thread: " + Thread.currentThread().getName());
				System.out.println("Current thread priority : " + Thread.currentThread().getPriority());
			}
		});
		thread.setName("new worker thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("we rae in thread : " + Thread.currentThread().getName() + " Before starting thread");

		thread.start();
		System.out.println("we rae in thread : " + Thread.currentThread().getName() + " after starting thread");
		Thread.sleep(10000);
	}
}
