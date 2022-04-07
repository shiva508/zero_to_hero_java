package com.pool.l1.thread.thread;

public class BatSuiteExecuter {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			BatSuiteOne batSuiteOne = new BatSuiteOne(i);
			batSuiteOne.start();
		}

	}
}
