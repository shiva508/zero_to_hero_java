package com.pool.l1.thread.v2.executers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableProcessoer implements Callable<String> {
	private int id;

	public CallableProcessoer(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Id-" + id;
	}
}

public class CallableExecuterClient {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<Future<String>> futures = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Future<String> future = executorService.submit(new CallableProcessoer(i + 1));
			futures.add(future);
		}
		for (Future<String> future : futures) {
			System.out.println(future.get());
		}
		executorService.shutdown();
	}
}
