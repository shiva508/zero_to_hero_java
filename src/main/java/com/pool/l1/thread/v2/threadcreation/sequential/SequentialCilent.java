package com.pool.l1.thread.v2.threadcreation.sequential;

class RunnerOne {
	public void execute() {
		for (int i = 0; i < 10; i++) {
			System.out.println("RunnerOne:" + i);
		}
	}
}

class RunnerTwo {
	public void execute() {
		for (int i = 0; i < 10; i++) {
			System.out.println("RunnerTwo:" + i);
		}
	}
}

public class SequentialCilent {
	public static void main(String[] args) {
		RunnerOne runnerOne = new RunnerOne();
		RunnerTwo runnerTwo = new RunnerTwo();
		runnerOne.execute();
		runnerTwo.execute();
	}
}
