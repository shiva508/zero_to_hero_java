package com.pool.l1.thread.v2.waitnotify;

class WaitNotifyProcess {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Executing Producer");
			wait();
			System.out.println("Executing Producer Again");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Executing consume");
			notify();
		}
	}
}

public class WaitNotifyClient {

	public static void main(String[] args) {
		WaitNotifyProcess notifyProcess = new WaitNotifyProcess();
		Thread thread1 = new Thread(() -> {
			try {
				notifyProcess.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() -> {
			try {
				notifyProcess.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		thread1.start();
		thread2.start();
	}
}
