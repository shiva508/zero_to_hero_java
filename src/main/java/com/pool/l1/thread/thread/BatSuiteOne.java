package com.pool.l1.thread.thread;

public class BatSuiteOne extends Thread {
	private Integer threadNumber;

	public BatSuiteOne(Integer threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int myList = 0; myList < 8; myList++) {
			System.out.println(myList +" ThreadName_"+threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
