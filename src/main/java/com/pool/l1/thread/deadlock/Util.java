package com.pool.l1.thread.deadlock;

public class Util {
	static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
