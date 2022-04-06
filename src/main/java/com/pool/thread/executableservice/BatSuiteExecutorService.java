package com.pool.thread.executableservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BatSuiteExecutorService {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		long startTime=System.currentTimeMillis();
		/* for (int i = 0; i < 10; i++) { */
			executorService.execute(newRunnable("Thread-1"));
			executorService.execute(newRunnable("Thread-2"));
			executorService.execute(newRunnable("Thread-3"));
			executorService.execute(newRunnable("Thread-4"));
			executorService.execute(newRunnable("Thread-5"));
			executorService.shutdown();
			/* } */
		long endTime=System.currentTimeMillis();
		System.out.println("Time:"+(endTime-startTime));
	}

	private static Runnable newRunnable(String threadName) {
		return new Runnable() {
			@Override
			public void run() {
				
				try {
					String message = threadName;
					System.out.println(threadName);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}
}
