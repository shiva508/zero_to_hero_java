package com.pool.l1.thread.teach;

public class PrintNumberRunnable extends DoSomting implements Runnable  {

	private String squalnceName;

	public PrintNumberRunnable(String squalnceName) {
		this.squalnceName = squalnceName;
	}

	@Override
	public void run() {
		printNumberSequence(squalnceName);
	}

	public void printNumberSequence(String squalnceName) {
		for (int i = 0; i < 10000; i++) {
			System.out.println(squalnceName + ":" + i);
		}
	}
}
