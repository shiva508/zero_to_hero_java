package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MapFirstWorker implements Runnable {
	private ConcurrentMap<String, Integer> map;

	public MapFirstWorker(ConcurrentMap<String, Integer> map) {
		super();
		this.map = map;
	}

	@Override
	public void run() {

		try {
			map.put("B", 408);
			Thread.sleep(1000);
			map.put("Z", 28);
			map.put("A", 508);
			Thread.sleep(1000);
			map.put("W", 48);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class MapSecondWorker implements Runnable {
	private ConcurrentMap<String, Integer> map;

	public MapSecondWorker(ConcurrentMap<String, Integer> map) {
		super();
		this.map = map;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(5000);
			System.out.println(map.get("B"));
			Thread.sleep(2000);
			System.out.println(map.get("Z"));
			System.out.println(map.get("A"));
			System.out.println(map.get("W"));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class ConcurrentMapClient {
	public static void main(String[] args) {
		ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
		new Thread(new MapFirstWorker(concurrentMap)).start();
		new Thread(new MapSecondWorker(concurrentMap)).start();
	}
}
