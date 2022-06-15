package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.List;
import java.util.Random;

public class ReadTask implements Runnable {
	private List<Integer> list;
	private Random random;

	public ReadTask(List<Integer> list) {
		super();
		this.list = list;
		random = new Random();
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.set(random.nextInt(list.size()), random.nextInt(10));
			System.out.println(list);
		}

	}
}
