package com.pool.l1.thread.v2.synchronizedcollection;

import java.util.List;
import java.util.Random;

public class CopyOnWriteArrayClient {
	public static void main(String[] args) {
		ConcurrentArray concurrentArray = new ConcurrentArray();
		concurrentArray.stimuate();
	}
}
