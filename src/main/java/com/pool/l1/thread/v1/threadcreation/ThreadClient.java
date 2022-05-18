package com.pool.l1.thread.v1.threadcreation;

public class ThreadClient {
	public static void main(String[] args) {
		CustomThread customThread = new CustomThread();
		customThread.start();
	}
}
