package com.pool.l1.thread.v2.forkjoin;

import java.util.concurrent.RecursiveTask;

public class ParallalMaxTask extends RecursiveTask<Long> {
	private long data[];
	private int lowindex;
	private int heighindex;

	public ParallalMaxTask(long[] data, int lowindex, int heighindex) {
		this.data = data;
		this.lowindex = lowindex;
		this.heighindex = heighindex;
	}

	@Override
	protected Long compute() {

		if (heighindex - lowindex < 10000) {
			return sequentialMaxFinding();
		} else {
			int middleIndex = (heighindex + lowindex) / 2;
			ParallalMaxTask maxTask1 = new ParallalMaxTask(data, lowindex, middleIndex);
			ParallalMaxTask maxTask2 = new ParallalMaxTask(data, middleIndex + 1, heighindex);
			invokeAll(maxTask1, maxTask2);
			return Math.max(maxTask1.join(), maxTask2.join());
		}
	}

	private Long sequentialMaxFinding() {
		long max = data[lowindex];
		for (int i = lowindex+1; i < heighindex; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

}
