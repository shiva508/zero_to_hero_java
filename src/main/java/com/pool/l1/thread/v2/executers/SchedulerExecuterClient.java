package com.pool.l1.thread.v2.executers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class SingleTaskShedular implements Runnable {

	@Override
	public void run() {
		System.out.println("Task with processing ");
	}
}

public class SchedulerExecuterClient {
	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
		executorService.scheduleAtFixedRate(new SingleTaskShedular(), 2000, 5000, TimeUnit.MICROSECONDS);
	}
}
