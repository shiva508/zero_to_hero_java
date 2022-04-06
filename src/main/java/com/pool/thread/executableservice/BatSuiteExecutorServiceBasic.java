package com.pool.thread.executableservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BatSuiteExecutorServiceBasic {
	public static void main(String[] args) {
		int corePoolSize = 10;
		int maxPoolSize = 20;
		long keepAliveTime = 3000;
		ExecutorService threadPoolExecutorService = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128));
		threadPoolExecutorService = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
		
		ScheduledExecutorService scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(corePoolSize);
	}
}
