package com.pool.l1.thread.v2.dinning;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
	private int id;
	private Lock lock;

	public Chopstick(int id) {
		this.id = id;
		lock = new ReentrantLock();
	}

	public boolean pickUp(Philosopher philosoper, State state) {
		try {
			if (lock.tryLock(10, TimeUnit.NANOSECONDS)) {
				System.out.println(philosoper + " pickup " + state.toString() + " " + this);
				return true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void putDown(Philosopher philosoper, State state) {
		lock.unlock();
		System.out.println(philosoper + " put down " + state.toString() + this);
	}

	@Override
	public String toString() {
		return "Chopstick [id=" + id + "]";
	}

}
