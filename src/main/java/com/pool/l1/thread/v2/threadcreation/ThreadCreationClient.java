package com.pool.l1.thread.v2.threadcreation;

class RunnerOne extends Thread {
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

class RunnerTwo extends Thread {
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

public class ThreadCreationClient {

	public static void main(String[] args) {
		RunnerOne runnerOne = new RunnerOne();
		RunnerTwo runnerTwo = new RunnerTwo();

		runnerOne.start();
		runnerTwo.start();
	}

}
