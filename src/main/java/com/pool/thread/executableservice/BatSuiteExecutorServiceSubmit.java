package com.pool.thread.executableservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BatSuiteExecutorServiceSubmit {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		long startTime=System.currentTimeMillis();
		/* for (int i = 0; i < 10; i++) { */
			Future future=executorService.submit(newRunnable("Thread-1"));
			
			System.out.println(future.isDone());
			try {
				future.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			System.out.println(future.isDone());
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
