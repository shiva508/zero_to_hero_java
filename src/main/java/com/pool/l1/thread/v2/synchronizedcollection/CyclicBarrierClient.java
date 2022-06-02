package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CyclicBarrierWorker implements Runnable {
	private int id;
	private Random random;
	private CyclicBarrier barrier;

	public CyclicBarrierWorker(int id, CyclicBarrier barrier) {
		super();
		this.id = id;
		this.barrier = barrier;
		random = new Random();
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread with id " + this.id + " starts working");
			Thread.sleep(random.nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

public class CyclicBarrierClient {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CyclicBarrier barrier = new CyclicBarrier(5, () -> {
			System.out.println("All tasks finished");
		});

		for (int i = 0; i < 5; i++) {
			executorService.execute(new CyclicBarrierWorker(i + 1, barrier));
		}
		executorService.shutdown();
		System.out.println("After awaite");
	}
}
