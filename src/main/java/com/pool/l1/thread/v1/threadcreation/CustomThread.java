package com.pool.l1.thread.v1.threadcreation;

public class CustomThread extends Thread {
	@Override
	public void run() {
		System.out.println("we are now in thread: " + Thread.currentThread().getName());
	}
}
