package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BlockingWorker implements Runnable {

	private BlockingQueue<Integer> queue;

	public BlockingWorker(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		int counter = 0;
		while (true) {
			try {
				queue.put(counter);
				counter++;
				System.out.println("Counter " + counter);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class BlockingWorkerTwo implements Runnable {

	private BlockingQueue<Integer> queue;

	public BlockingWorkerTwo(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int counter = queue.take();
				System.out.println("taking from Counter " + counter);
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class BlockingQueueClient {
	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
		BlockingWorker blockingWorker = new BlockingWorker(blockingQueue);
		BlockingWorkerTwo blockingWorkerTwo = new BlockingWorkerTwo(blockingQueue);
		new Thread(blockingWorker).start();
		new Thread(blockingWorkerTwo).start();
	}
}
