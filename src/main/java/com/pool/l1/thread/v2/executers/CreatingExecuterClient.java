package com.pool.l1.thread.v2.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SingleTask implements Runnable {
	private Integer id;

	public SingleTask(Integer id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Task with id " + id + " is in work - thread id" + Thread.currentThread().getName());
		long duriation = (long) (Math.random() * 5);
		try {
			TimeUnit.SECONDS.sleep(duriation);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class CreatingExecuterClient {
	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 8; i++) {
			executorService.execute(new SingleTask(i + 1));
		}
		executorService.shutdown();
	}
}
