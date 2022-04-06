package com.pool.thread.executableservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class BatSuiteExecutorServiceCancle {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		long startTime = System.currentTimeMillis();

		Future<ScanData> future = executorService.submit(newCallable("THREAD-1"));

		System.out.println(future.isDone());

		boolean mayInterrupt = true;
		boolean wasCanceled=future.cancel(mayInterrupt);
		System.out.println(wasCanceled);

		try {
			ScanData scanData = future.get();
			System.out.println(scanData);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} catch (CancellationException e) {
			String cancelationMasg=" Could not call future.get() as thread closed";
			System.out.println(cancelationMasg);
		}
		System.out.println(future.isDone());
		System.out.println(future.isCancelled());
		executorService.shutdown();
		
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
