package com.pool.l1.thread.v2.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class SimpleRecurssiveTaskClient {
	public static void main(String[] args) {
		ForkJoinPool joinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecurssiveTask recurssiveTask = new SimpleRecurssiveTask(130);
		System.out.println(joinPool.invoke(recurssiveTask));
	}
}
