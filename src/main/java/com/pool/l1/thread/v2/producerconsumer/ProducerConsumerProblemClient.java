package com.pool.l1.thread.v2.producerconsumer;

import java.util.ArrayList;
import java.util.List;

class BunFactoryProb {
	private List<Integer> list = new ArrayList<>();
	private static final int UPPER_LIMIT = 5;
	private static final int LOWER_LIMIT = 0;
	private int value = 0;

	public void producer() {

		while (true) {
			if (list.size() <= UPPER_LIMIT) {
				System.out.println("Adding value:" + value);
				list.add(value);
				value++;
			}

		}
	}

	public void consumer() {
		while (true) {
			if (list.size() > LOWER_LIMIT) {
				System.out.println("Removing value:" + list.remove(list.size() - 1));
				value--;
			}
		}

	}

}

public class ProducerConsumerProblemClient {
	public static void main(String[] args) {
		BunFactoryProb bunFactory = new BunFactoryProb();

		bunFactory.producer();

		bunFactory.consumer();

	}
}
