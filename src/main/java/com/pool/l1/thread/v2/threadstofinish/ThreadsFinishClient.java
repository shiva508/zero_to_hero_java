package com.pool.l1.thread.v2.threadstofinish;

public class ThreadsFinishClient {
	static class RunnerOne implements Runnable {
		public void execute() {
			for (int i = 0; i < 10; i++) {
				System.out.println("RunnerOne:" + i);
			}
		}

		@Override
		public void run() {
			this.execute();
		}
	}

	static class RunnerTwo implements Runnable {
		public void execute() {
			for (int i = 0; i < 10; i++) {
				System.out.println("RunnerTwo:" + i);
			}
		}

		@Override
		public void run() {
			execute();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RunnerOne runnerOne = new RunnerOne();
		RunnerTwo runnerTwo = new RunnerTwo();

		Thread thread1 = new Thread(runnerOne);
		Thread thread2 = new Thread(runnerTwo);

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

		System.out.println("Main is finished");
	}
}
