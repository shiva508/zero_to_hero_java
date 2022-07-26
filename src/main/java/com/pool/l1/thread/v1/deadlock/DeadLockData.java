package com.pool.l1.thread.v1.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockData {
	private Lock loack1 = new ReentrantLock();
	private Lock loack2 = new ReentrantLock();

	Object objectOne = new Object();
	Object objectTwo = new Object();

	public static void main(String[] args) {
		DeadLockData deadLockData = new DeadLockData();
		deadLockData.execute();
	}

	public void execute() {
		new Thread(this::processOne).start();
		new Thread(this::processTwo).start();
	}

	public void processOne() {
		loack1.lock();
		System.out.println("Lock1 -->processOne");
		loack2.lock();
		System.out.println("loack2 -->processOne");
		loack1.unlock();
		loack2.unlock();
	}

	public void processTwo() {
		loack2.lock();
		System.out.println("loack2 -->procesTwo");
		loack1.lock();
		System.out.println("Lock1 -->procesTwo");
		loack2.unlock();
		loack1.unlock();

	}

	public void processThree() {
		synchronized (objectOne) {
			
			synchronized (objectTwo) {
				
			}
		}
	}
	
	public void processFour() {
		synchronized (objectTwo) {
			synchronized (objectOne) {
				
			}
		}
	}
}
