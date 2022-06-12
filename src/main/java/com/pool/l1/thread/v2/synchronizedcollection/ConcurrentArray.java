package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArray {
	private List<Integer> list;

	public ConcurrentArray() {
		this.list = new CopyOnWriteArrayList<>();
		this.list.addAll(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0));
	}

	public void stimuate() {
		Thread thread1 = new Thread(new ReadTask(list));
		Thread thread2 = new Thread(new ReadTask(list));
		Thread thread3 = new Thread(new ReadTask(list));
		Thread thread4 = new Thread(new ReadTask(list));
		Thread thread5 = new Thread(new ReadTask(list));
		Thread thread6 = new Thread(new ReadTask(list));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}
}
