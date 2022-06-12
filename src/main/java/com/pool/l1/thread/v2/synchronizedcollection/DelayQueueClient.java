package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayWorker implements Delayed {

	private long durialtion;
	private String message;

	public DelayWorker(String message, long durialtion) {
		this.durialtion = System.currentTimeMillis() + durialtion;
		this.message = message;
	}

	@Override
	public int compareTo(Delayed other) {
		if (durialtion < ((DelayWorker) other).getDurialtion()) {
			return -1;
		}
		if (durialtion > ((DelayWorker) other).getDurialtion()) {
			return +1;
		}
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(durialtion - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return "DelayWorker [durialtion=" + durialtion + ", message=" + message + "]";
	}

	public long getDurialtion() {
		return durialtion;
	}

	public void setDurialtion(long durialtion) {
		this.durialtion = durialtion;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

public class DelayQueueClient {
	public static void main(String[] args) {
		BlockingDeque<DelayWorker> blockingDeque = (BlockingDeque<DelayWorker>) new DelayQueue();
		blockingDeque.push(new DelayWorker("1St",2000));
		blockingDeque.push(new DelayWorker("2nd",12000));
		blockingDeque.push(new DelayWorker("3rd",4000));
		
		while (!blockingDeque.isEmpty()) {
			try {
				System.out.println(blockingDeque.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
