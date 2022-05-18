package com.pool.l1.thread.v1.threadcreation.execirsise;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {

	private final List<Runnable> tasks;

	public MultiExecutor(List<Runnable> tasks) {
		this.tasks = tasks;
	}

	/**
	 * Starts and executes all the tasks concurrently
	 */
	public void executeAll() {
		List<Thread> threads = new ArrayList<>(tasks.size());
		for (Runnable runnable : threads) {
			Thread thread = new Thread(runnable);
			threads.add(thread);
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
