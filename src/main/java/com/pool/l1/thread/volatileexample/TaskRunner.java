package com.pool.l1.thread.volatileexample;

public class TaskRunner {
	private static volatile int number;
	private static volatile boolean ready;

	private static class Reader extends Thread {
		@Override
		public void run() {
			while (!ready) {
				Thread.yield();
			}
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		new Reader().start();
		number=408;
		ready=true;
	}
}
