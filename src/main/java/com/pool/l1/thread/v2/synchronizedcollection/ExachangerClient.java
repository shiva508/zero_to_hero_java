package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.Exchanger;

class ExchangeFirstThread implements Runnable {
	private int counter;
	private Exchanger<Integer> exchanger;

	public ExchangeFirstThread(Exchanger<Integer> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		while (true) {
			counter++;
			System.out.println("First thread counter value:" + counter);
			try {
				counter = exchanger.exchange(counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ExchangeSecondThread implements Runnable {
	private int counter;
	private Exchanger<Integer> exchanger;

	public ExchangeSecondThread(Exchanger<Integer> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		while (true) {
			counter--;
			System.out.println("Second thread counter value:" + counter);
			try {
				counter = exchanger.exchange(counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExachangerClient {
	public static void main(String[] args) {
		Exchanger<Integer> exchanger = new Exchanger<>();
		ExchangeFirstThread exchangeFirstThread = new ExchangeFirstThread(exchanger);
		ExchangeSecondThread exchangeSecondThread = new ExchangeSecondThread(exchanger);
		new Thread(exchangeFirstThread).start();
		new Thread(exchangeSecondThread).start();
	}
}
