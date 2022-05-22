package com.pool.l1.thread.v1.threadresourcesharing;

public class RaceAndDataRace {

	public static void main(String[] args) {
		SharedClass sharedClass = new SharedClass();
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				sharedClass.increament();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				sharedClass.checkForDataRace();
			}
		});
		thread1.start();

		thread2.start();
	}

	private static class SharedClass {
		private volatile int x = 0;
		private volatile int y = 0;

		public void increament() {
			x++;
			y++;
		}

		public void checkForDataRace() {
			if (y > x) {
				System.out.println("Data Race Happend");
			}
		}
	}
}
