package com.pool.l1.thread.v1.joiningthreads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialClient extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// List<Long> inputNumbers = Arrays.asList(0L, 3435L, 35435L, 2324L, 4656L, 23L,
		// 5556L);
		// Large time consuming operations
		List<Long> inputNumbers = Arrays.asList(1000000000L, 3435L, 35435L, 2324L, 4656L, 23L, 5556L);
		List<FactorialThread> factorialThreads = new ArrayList<>();
		for (Long inputNumber : inputNumbers) {
			factorialThreads.add(new FactorialThread(inputNumber));
		}

		for (Thread factorialThread : factorialThreads) {
			//
			factorialThread.setDaemon(true);
			factorialThread.start();
			
		}

		for (Thread factorialThread : factorialThreads) {
			// factorialThread.join();
			// for time consuming operations
			factorialThread.join(5000);
		}

		for (int i = 0; i < inputNumbers.size(); i++) {
			FactorialThread factorialThread = factorialThreads.get(i);
			if (factorialThread.isFinished) {
				System.out.println("Calculation finished: result:" + factorialThread.getResult());
			} else {
				System.out.println("Calculation still in progress:" + inputNumbers.get(i));
			}
		}
	}

	private static class FactorialThread extends Thread {
		private Long inputNumber;
		private BigInteger result = BigInteger.ZERO;
		private boolean isFinished = false;

		public FactorialThread(Long inputNumber) {
			this.inputNumber = inputNumber;
		}

		public BigInteger getResult() {
			return result;
		}

		public boolean isFinished() {
			return isFinished;
		}

		public BigInteger factorialOfNumber(long n) {
			BigInteger tempResult = BigInteger.ONE;
			long startTime = System.currentTimeMillis();
			for (long i = n; i > 0; i--) {
				tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
				if (startTime > 5000) {
					//Thred.setDaemon(true);
					
				}
			}
			return tempResult;
		}

		@Override
		public void run() {
			this.result = this.factorialOfNumber(inputNumber);
			this.isFinished = true;
		}

	}
}
