package com.pool.l1.thread.deadlock;


public class DeadLockDemo {

	public void sendSms() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public void sendEmail() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}
	public static void main(String[] args) {
		DeadLockDemo deadLockDemo=new DeadLockDemo();
		Thread thread=new Thread((Runnable) deadLockDemo);
		thread.start();
	}
}
