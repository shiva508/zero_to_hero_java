package com.pool.thread.basic;

public class CountThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Chield Thread:"+1);
		}
	}
}
