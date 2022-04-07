package com.pool.l1.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread {
	private CountDownLatch countDownLatch;

	
	public DevTeam(CountDownLatch countDownLatch,String teamName) {
		super(teamName);
		this.countDownLatch = countDownLatch;
	}


	@Override
	public void run() {
		System.out.println("Strat team "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End team  "+Thread.currentThread().getName());
		countDownLatch.countDown();
	}
}
