package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.PriorityBlockingQueue;

class Persom implements Comparable<Persom> {
	private Integer userId;
	private String userName;

	public Persom(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public int compareTo(Persom person) {
		return this.userName.compareTo(person.getUserName());
	}

	@Override
	public String toString() {
		return "Persom [userId=" + userId + ", userName=" + userName + "]";
	}

}

class PriorityFirstWorker implements Runnable {

	private PriorityBlockingQueue<String> queue;

	public PriorityFirstWorker(PriorityBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			queue.add("A");
			queue.add("B");
			queue.add("C");
			Thread.sleep(2000);
			queue.add("D");
			queue.add("E");
			Thread.sleep(1000);
			queue.add("F");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class PrioritySecondWorker implements Runnable {

	private PriorityBlockingQueue<String> queue;

	public PrioritySecondWorker(PriorityBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(5000);
			System.out.println(queue.take());
			System.out.println(queue.take());
			Thread.sleep(1000);
			System.out.println(queue.take());
			Thread.sleep(2000);
			System.out.println(queue.take());
			System.out.println(queue.take());
			Thread.sleep(1000);
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class PriorityQueueClient {
	public static void main(String[] args) {
		PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
		PriorityFirstWorker firstWorker = new PriorityFirstWorker(queue);
		PrioritySecondWorker secondWorker = new PrioritySecondWorker(queue);
		new Thread(firstWorker).start();
		new Thread(secondWorker).start();
	}
}
