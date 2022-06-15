package com.pool.l1.thread.v2.dinning;

import java.util.Random;

public class Philosopher implements Runnable {
	private int id;
	private volatile boolean full;
	private Chopstick leftChopstick;
	private Chopstick rightChopstick;
	private Random random;
	private int eatingCounter;

	public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
		super();
		this.id = id;
		this.leftChopstick = leftChopstick;
		this.rightChopstick = rightChopstick;
		this.random = new Random();
	}

	@Override
	public void run() {
		try {
			while (!full) {
				this.think();
				if (leftChopstick.pickUp(this, State.LEFT)) {
					if (rightChopstick.pickUp(this, State.RIGHT)) {
						this.eat();
						rightChopstick.putDown(this, State.RIGHT);
					}
					leftChopstick.putDown(this, State.RIGHT);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void think() {

		try {
			System.out.println(this + " thinking.....");
			Thread.sleep(this.random.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void eat() {

		try {
			eatingCounter++;
			System.out.println(this + " eating.....");
			Thread.sleep(this.random.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	public int getEatingCounter() {
		return eatingCounter;
	}

	public void setEatingCounter(int eatingCounter) {
		this.eatingCounter = eatingCounter;
	}

	@Override
	public String toString() {
		return "Philosopher [id=" + id + "]";
	}

}
