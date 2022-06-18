package com.pool.l1.thread.v2.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiClient {
	public static void main(String[] args) {
		numberOperations();
		String[] names = { "Shiva", "Nithya", "Satish", "Ravi" };
		Stream.of(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Stream.of(names).filter(x -> x.contains("N")).forEach(System.out::println);
	}

	private static void numberOperations() {
		int[] num = { 1, 5, 3, -2, 9, 12 };
		int sun = 0;
		for (int i = 0; i < num.length; i++) {
			sun += num[i];
		}
		System.out.println(sun);
		int sum = IntStream.of(num).boxed().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		Arrays.stream(num).sum();
		Arrays.stream(num).boxed().map(Integer::intValue).distinct();
		IntStream.range(0, sum).filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}
