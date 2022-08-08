package com.pool.l1.thread.teach;

public class RunningRace {
	public static void main(String[] args) {
		// narmalExecutionFlow();

		executionUsingThread();
	}

	private static void executionUsingThread() {
		Long startTime = System.currentTimeMillis();
		System.out.println("Main Method Started");
		PrintNumberThread printNumberThread = new PrintNumberThread("Test Cricket");// NEW STATE
		PrintNumberThread printNumberThreadOnes = new PrintNumberThread("One day Cricket");
		printNumberThread.start();//WAITING STATE(until thread schedulr give it channce to execute code)
		// if code is running -->running state
		printNumberThreadOnes.start();
		try {
			printNumberThread.join();
			printNumberThreadOnes.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main Method Ended");
		Long endTime = System.currentTimeMillis();
		System.out.println("Time Taken:" + (endTime - startTime));
	}

	private static void narmalExecutionFlow() {
		Long startTime = System.currentTimeMillis();
		System.out.println("Main Method Started");
		PrintNumber printNumber = new PrintNumber();
		printNumber.printNumberSequence("Test Cricket");

		PrintNumber printNumberOneDay = new PrintNumber();
		printNumberOneDay.printNumberSequence("OneDay Cricket");
		System.out.println("Main Method Ended");
		Long endTime = System.currentTimeMillis();
		System.out.println("Time Taken:" + (endTime - startTime));
	}
}
