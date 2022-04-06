package com.pool.thread.executableservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyProject {
	public static void main(String[] args) {
		List<String> overData = new ArrayList<>();
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		Future<List<String>> future = extracted(executorService);
		Future<List<String>> future1 = extracted1(executorService);
		try {
			overData.addAll(future.get());
			
			overData.addAll(future1.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
		System.out.println(overData);
		System.out.println("COMPLETED");
	}

	private static Future<List<String>> extracted(ExecutorService executorService) {
		Future< List<String>> future=executorService.submit(new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				System.out.println("ONE");
				return Arrays.asList("1","2","3");
			}
		});
		return future;
	}
	private static Future<List<String>> extracted1(ExecutorService executorService) {
		Future< List<String>> future=executorService.submit(new Callable<List<String>>() {

			@Override
			public List<String> call() throws Exception {
				System.out.println("TWO");
				return Arrays.asList("4","5","6");
			}
		});
		return future;
	}
	
	private static Future<List<String>> extracted3(ExecutorService executorService) {
		Future< List<String>> future=executorService.submit(()-> {

			
				System.out.println("ONE");
				return Arrays.asList("1","2","3");
			
		});
		return future;
	}
}
