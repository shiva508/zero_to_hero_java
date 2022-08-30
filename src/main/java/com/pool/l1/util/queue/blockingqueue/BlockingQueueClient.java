package com.pool.l1.util.queue.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueClient {
	public static void main(String[] args) {
		BlockingQueue<String> arrayBlockingQueue=new ArrayBlockingQueue<>(10);
		BlockingQueue<String> linkedBlockingDeque=new LinkedBlockingDeque<>();
		
	}
}
