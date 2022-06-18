package com.pool.l1.thread.v2.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinClient {
	public static void main(String[] args) {
		ForkJoinPool joinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction recursiveAction = new SimpleRecursiveAction(120);
		//recursiveAction.invoke();
		joinPool.invoke(recursiveAction);
	}
}
