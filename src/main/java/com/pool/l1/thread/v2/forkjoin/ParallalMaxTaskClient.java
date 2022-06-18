package com.pool.l1.thread.v2.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ParallalMaxTaskClient {
	public static void main(String[] args) {
		long[] data = createNumbers(100000000);
		ForkJoinPool joinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SequentialMatchFinding finding = new SequentialMatchFinding();
		long startTime = System.currentTimeMillis();
		System.out.println("MAX=" + finding.findMax(data));
		long endTime = System.currentTimeMillis();
		System.out.println("SEQUENTIAL TIME TAKEN=" + (endTime - startTime));
		
		ParallalMaxTask action=new  ParallalMaxTask(data, 0, data.length);
		long startTime2 = System.currentTimeMillis();
		System.out.println("PARALLA="+joinPool.invoke(action));
		long endTime2 = System.currentTimeMillis();
		System.out.println("SEQUENTIAL TIME TAKEN=" + (endTime2 - startTime2));
	}

	public static long[] createNumbers(int n) {
		Random random = new Random();
		long[] nums = new long[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextLong(1000);
		}
		return nums;
	}
}
