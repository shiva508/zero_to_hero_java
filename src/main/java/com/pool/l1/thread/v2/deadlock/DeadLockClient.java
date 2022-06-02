package com.pool.l1.thread.v2.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockClient {
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {
		DeadLockClient client = new DeadLockClient();
		new Thread(client::worker1, "worker1").start();
		new Thread(client::worker2, "worker2").start();
	}

	public void worker1() {
		lock1.lock();
		System.out.println("Worker 1 aquired lock1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock2.lock();
		System.out.println("Worker 1 aquired lock2");
		lock1.unlock();
		lock2.unlock();
	}

	public void worker2() {
		lock2.lock();
		System.out.println("Worker 2 aquired lock2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock1.lock();
		System.out.println("Worker 2 aquired lock1");
		lock2.unlock();
		lock1.unlock();
	}
}
