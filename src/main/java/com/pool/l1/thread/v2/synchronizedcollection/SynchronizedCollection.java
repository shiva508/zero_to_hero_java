package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {
	public static void main(String[] args) {
		// List<Integer> list = new ArrayList<>();
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
}
