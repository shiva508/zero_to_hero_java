package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LatchWorker implements Runnable {
	private int id;
	private CountDownLatch latch;

	public LatchWorker(int id, CountDownLatch latch) {
		this.id = id;
		this.latch = latch;
	}

	@Override
	public void run() {
		doWork();
		latch.countDown();
	}

	public void doWork() {
		try {
			System.out.println("Thread with id " + this.id + " starts working");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LatchClient {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new LatchWorker(i, countDownLatch));
		}
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
		System.out.println("All tasks completed");
	}
}
