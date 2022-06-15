package com.pool.l1.thread.v2.dinning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DinningPhilosoperClient {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		Philosopher[] philosophers = null;
		Chopstick[] chopsticks = null;
		try {
			philosophers = new Philosopher[Constants.NUMBER_OF_PHILOSOPHERS];
			chopsticks = new Chopstick[Constants.NUMBER_OF_CHOPSTICKS];
			for (int i = 0; i < Constants.NUMBER_OF_CHOPSTICKS; i++) {
				chopsticks[i] = new Chopstick(i);
			}
			service = Executors.newFixedThreadPool(Constants.NUMBER_OF_PHILOSOPHERS);
			for (int i = 0; i < Constants.NUMBER_OF_PHILOSOPHERS; i++) {
				philosophers[i] = new Philosopher(i, chopsticks[i],
						chopsticks[(i + 1) % Constants.NUMBER_OF_PHILOSOPHERS]);
				service.execute(philosophers[i]);

			}
			Thread.sleep(Constants.STIMMULATION_RUNNING_TIME);
			for (Philosopher philosopher : philosophers) {
				philosopher.setFull(true);
			}
		} finally {
			service.shutdown();
			while (service.isTerminated())
				Thread.sleep(1000);
			for (Philosopher philosopher : philosophers)
				System.out.println(philosopher + " eat # " + philosopher.getEatingCounter() + " times");

		}
	}
}
