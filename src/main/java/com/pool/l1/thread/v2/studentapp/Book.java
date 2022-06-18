package com.pool.l1.thread.v2.studentapp;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {
	private int id;
	private Lock lock;

	public Book(int id) {
		super();
		this.id = id;
		lock = new ReentrantLock();
	}

	public void read(Student student) {
		try {
			if (lock.tryLock(20, TimeUnit.MICROSECONDS)) {
				System.out.println(student + " reading " + this);
				Thread.sleep(2000);
				lock.unlock();
				System.out.println(student + " finished reading " + this);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Book id=" + id;
	}

}
