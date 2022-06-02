package com.pool.l1.thread.v2.volatileparam;

class VolatileWorker implements Runnable {
	private volatile boolean terminated = false;

	@Override
	public void run() {
		while (!terminated) {
			System.out.println("Working class is running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isTerminated() {
		return terminated;
	}

	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}

}

public class VolatileClient {
	public static void main(String[] args) {
		VolatileWorker volatileWorker = new VolatileWorker();
		Thread thread = new Thread(volatileWorker);
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		volatileWorker.setTerminated(true);
		System.out.println("Terminated ");
	}
}
