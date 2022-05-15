package com.pool.l2.featurs8.streams.partioning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitioningClient {
	public static void main(String[] args) {
		List<String> listOfNames = IntStream.rangeClosed(0, 10).mapToObj(index -> "Shva" + index)
				.collect(Collectors.toList());
		System.out.println(listOfNames);

		int chunkCounter = listOfNames.size() / 3;
		AtomicInteger atomicInteger = new AtomicInteger();
		List<List<String>> partionaed = new ArrayList<>(listOfNames.stream()
				.collect(Collectors.groupingBy(ls -> atomicInteger.getAndIncrement() / (chunkCounter + 1))).values());
		System.out.println(partionaed);
	}
}
