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

public class BatSuiteExecutorServiceInvokeAny {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		long startTime = System.currentTimeMillis();
		List<Callable<ScanData>> callables=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			callables.add(newCallable("Thread-" + i));
		}
		
			List<Future<ScanData>> futureScanData=null;
			try {
				futureScanData = executorService.invokeAll(callables);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			futureScanData.forEach(data->{
				try {
					System.out.println(data.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		
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
