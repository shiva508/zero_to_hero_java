package com.pool.l1.thread.v2.forkjoin;

public class SequentialMatchFinding {

	public long findMax(long[] data) {
		long max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;

	}
}
