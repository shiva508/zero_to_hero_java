package com.pool.l1.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class LatchClient {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(2);
		DevTeam devTeamA = new DevTeam(countDownLatch, "Team A");
		DevTeam devTeamB = new DevTeam(countDownLatch, "Team B");
		devTeamA.start();
		devTeamB.start();
		countDownLatch.await();
		System.out.println("DDDDD");
	}
}
