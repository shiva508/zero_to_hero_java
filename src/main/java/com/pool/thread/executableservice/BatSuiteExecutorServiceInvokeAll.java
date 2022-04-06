package com.pool.thread.executableservice;

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

public class BatSuiteExecutorServiceInvokeAll {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		long startTime = System.currentTimeMillis();
		List<Callable<ScanData>> callables=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			callables.add(newCallable("Thread-" + i));
		}
		try {
			ScanData scanData=executorService.invokeAny(callables);
			System.out.println(scanData);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
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
