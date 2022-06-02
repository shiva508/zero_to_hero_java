package com.pool.l1.thread.v2.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StopTaskShedular implements Runnable {
	private Integer id;

	public StopTaskShedular(Integer id) {
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
			Thread.currentThread().interrupt();
		}
	}
}

public class StopExecuterClient {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 8; i++) {
			executorService.execute(new StopTaskShedular(i + 1));
		}
		executorService.shutdown();

		try {
			if (!executorService.awaitTermination(1000, TimeUnit.MICROSECONDS)) {
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			executorService.shutdownNow();
		}
	}
}
