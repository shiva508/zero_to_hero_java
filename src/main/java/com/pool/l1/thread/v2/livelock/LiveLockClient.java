package com.pool.l1.thread.v2.livelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockClient {
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {
		LiveLockClient liveDeadlock = new LiveLockClient();
		new Thread(liveDeadlock::worker1, "worker1").start();
		new Thread(liveDeadlock::worker2, "worker2").start();
	}

	public void worker1() {

		while (true) {
			try {
				lock1.tryLock(50, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Worker1 acuired lock1....");
			System.out.println("Worker1 trying to acuire lock2....");

			if (lock2.tryLock()) {
				System.out.println("Worker1 acuired lock2....");
				lock2.unlock();
			} else {
				System.out.println("Worker1 can not acuire lock2....");
				continue;
			}
			break;
		}

		lock1.unlock();
		lock2.unlock();
	}

	public void worker2() {
		while (true) {
			try {
				lock2.tryLock(50, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Worker2 acuired lock2....");
			System.out.println("Worker2 trying to acuire lock1....");

			if (lock1.tryLock()) {
				System.out.println("Worker2 acuired lock1....");
				lock1.unlock();
			} else {
				System.out.println("Worker1 can not acuire lock1....");
				continue;
			}
			break;
		}
		lock2.unlock();
		lock1.unlock();
	}
}
