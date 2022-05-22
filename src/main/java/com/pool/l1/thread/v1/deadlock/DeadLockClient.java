package com.pool.l1.thread.v1.deadlock;

import java.util.Random;

public class DeadLockClient {
	public static void main(String[] args) {
		Intersection intersection = new Intersection();
		Thread trainA = new Thread(new TrainA(intersection));
		Thread trainB = new Thread(new TrainB(intersection));
		trainA.start();
		trainB.start();
	}

	public static class TrainA extends Thread {
		private Intersection intersection;
		private Random random = new Random();

		public TrainA(Intersection intersection) {
			this.intersection = intersection;
		}

		@Override
		public void run() {
			while (true) {
				long sleepingTime = random.nextLong(5);
				try {
					Thread.sleep(sleepingTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				intersection.takeroadA();
			}
		}
	}

	public static class TrainB extends Thread {
		private Intersection intersection;
		private Random random = new Random();

		public TrainB(Intersection intersection) {
			this.intersection = intersection;
		}

		@Override
		public void run() {
			while (true) {
				long sleepingTime = random.nextLong(5);
				try {
					Thread.sleep(sleepingTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				intersection.takeroadB();
			}
		}
	}

	private static class Intersection {
		private Object roadA = new Object();
		private Object roadB = new Object();

		public void takeroadA() {
			synchronized (roadA) {
				System.out.println("Road A is locked by Thread :" + Thread.currentThread().getName());
				synchronized (roadB) {
					System.out.println("Train is passing through road A");
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		public void takeroadB() {
			synchronized (roadB) {
				System.out.println("Road B is locked by Thread :" + Thread.currentThread().getName());
				synchronized (roadA) {
					System.out.println("Train is passing through road B");
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
