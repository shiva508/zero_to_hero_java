package com.pool.l1.thread.v1.interrupts;

public class InterruptPowerClient {
	public static void main(String[] args) {
		Thread thread = new Thread(new BlockingTask());
		thread.start();
		thread.interrupt();
	}

	private static class BlockingTask implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(500000);
			} catch (InterruptedException e) {
				System.out.println("Inturrupted Exception");
			}

		}

	}
}