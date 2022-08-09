package com.pool.l1.thread.teach;

public class RunnableTreadClient {
	public static void main(String[] args) {
		PrintNumberRunnable numberRunnableOne = new PrintNumberRunnable("Test Cricket");
		PrintNumberRunnable numberRunnableTwo = new PrintNumberRunnable("One day Cricket");
		Thread threadOne = new Thread(numberRunnableOne);
		Thread threadTwo = new Thread(numberRunnableTwo);
		threadOne.start();
		threadTwo.start();
	}
}
