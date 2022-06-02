package com.pool.l1.thread.v2.producerconsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankWorker {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void producer() throws InterruptedException {
		lock.lock();
		System.out.println("Producer meethod....");
		condition.await();// wait
		System.out.println("Producer meethod againe....");
		lock.unlock();
	}

	public void consumer() throws InterruptedException {
		Thread.sleep(2000);
		lock.lock();
		System.out.println("Comsumer method....");
		condition.signal();// notify
		lock.unlock();
	}
}

public class ProducerConsumerReetranantLockClient {

	public static void main(String[] args) {
		BankWorker bankWorker = new BankWorker();
		Thread thread1 = new Thread(() -> {
			try {
				bankWorker.producer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() -> {
			try {
				bankWorker.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
