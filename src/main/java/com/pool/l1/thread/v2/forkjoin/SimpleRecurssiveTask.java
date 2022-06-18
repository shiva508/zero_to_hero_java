package com.pool.l1.thread.v2.forkjoin;

import java.util.concurrent.RecursiveTask;

public class SimpleRecurssiveTask extends RecursiveTask<Integer> {
	private int simmulatedWork;

	public SimpleRecurssiveTask(int simmulatedWork) {
		super();
		this.simmulatedWork = simmulatedWork;
	}

	@Override
	protected Integer compute() {
		if (simmulatedWork > 100) {
			System.out.println("Parallel processing splitting and " + simmulatedWork);
			SimpleRecurssiveTask task1 = new SimpleRecurssiveTask(simmulatedWork / 2);
			SimpleRecurssiveTask task2 = new SimpleRecurssiveTask(simmulatedWork / 2);
			task1.fork();
			task2.fork();
			int subSolution = 0;
			subSolution += task1.join();
			subSolution += task2.join();
			return simmulatedWork;
		} else {
			System.out.println("Size is small so we can continue sequntially=" + simmulatedWork);
		}
		return simmulatedWork;
	}

}
