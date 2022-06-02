package com.pool.l1.thread.v2.mutextshemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum Download {
	ISTNACE;

	private Semaphore semaphore = new Semaphore(3, true);

	public void download() {
		try {
			semaphore.acquire();
			downloadData();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} finally {
			semaphore.release();
		}
	}

	public void downloadData() {
		try {
			System.out.println("Downloading from web");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class MutexClient {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 12; i++) {
			executorService.submit(() -> {
				Download.ISTNACE.download();
			});
		}
		executorService.shutdown();
	}
}
