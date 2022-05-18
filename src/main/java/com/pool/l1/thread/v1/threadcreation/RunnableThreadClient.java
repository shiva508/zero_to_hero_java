package com.pool.l1.thread.v1.threadcreation;

public class RunnableThreadClient {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				throw new RuntimeException("Internal Exception");
			}
		});
		thread.setName("Missbehaing thread");
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Critcal excetption happend " + t.getName() + " with exception " + e.getMessage());
			}
		});

		thread.start();

	}
}
