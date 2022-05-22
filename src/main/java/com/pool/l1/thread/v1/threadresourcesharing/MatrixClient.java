package com.pool.l1.thread.v1.threadresourcesharing;

import java.util.Random;

public class MatrixClient {

	public static void main(String[] args) {
		Matrics matrics = new Matrics();
		BusinessLogic businessLogic = new BusinessLogic(matrics);
		BusinessLogic businessLogic2 = new BusinessLogic(matrics);
		MatricsPrinter matricsPrinter = new MatricsPrinter(matrics);
		businessLogic.start();
		businessLogic2.start();
		matricsPrinter.start();
	}

	private static class Matrics {
		private long count = 0;
		private volatile double average = 0;

		public synchronized void addSample(long sample) {
			double currentSum = average * count;
			count++;
			average = (currentSum + sample) / count;
		}

		public double getAverage() {
			return average;
		}

	}

	private static class BusinessLogic extends Thread {
		private Matrics matriss;
		private Random random = new Random();

		public BusinessLogic(Matrics matriss) {
			this.matriss = matriss;
		}

		@Override
		public void run() {
			while (true) {
				long start = System.currentTimeMillis();
				try {
					Thread.sleep(random.nextInt(10));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				long end = System.currentTimeMillis();
				matriss.addSample(end - start);
			}
		}
	}

	private static class MatricsPrinter extends Thread {
		private Matrics matriss;

		public MatricsPrinter(Matrics matriss) {
			this.matriss = matriss;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				double currentAvarage = matriss.getAverage();
				System.out.println("matriss Current Avarage is :" + currentAvarage);
			}
		}
	}
}
