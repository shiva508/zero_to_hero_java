package com.pool.l1.thread.executableservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class BatSuiteExecutorServiceShoutdownNow {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		long startTime = System.currentTimeMillis();
		
		executorService.shutdown();
		List<Runnable> runnables=executorService.shutdownNow();
		try {
			executorService.awaitTermination(3000L, TimeUnit.MICROSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time:" + (endTime - startTime));
	}

	private static Callable<ScanData> newCallable(String scanName) {
		return new Callable<ScanData>() {

			@Override
			public ScanData call() throws Exception {
				ScanData data = new ScanData();
				data.setScanCreatedDate(new Date());
				data.setScanName(scanName);
				return data;
			}

		};
	}
}
