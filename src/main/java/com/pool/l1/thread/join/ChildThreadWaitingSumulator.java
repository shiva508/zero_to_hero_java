package com.pool.l1.thread.join;

public class ChildThreadWaitingSumulator {
	public static void main(String[] args) throws InterruptedException {
		Thread waiting = new ChildThreadWaiting().currentThread();
		ChildThreadWaiting threadWaiting = new ChildThreadWaiting();
		threadWaiting.start();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(5000);
			System.out.println("MAin THREAD");
		}
	}
}
