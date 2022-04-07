package com.pool.l2.featurs8.fp.reducingcollection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReducingCollectionClient {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		getMaxMinSumAvg(friends);
		usingReduce(friends);
		usingReduceWithDefault(friends, "Shiva");
	}

	private static void usingReduce(final List<String> friends) {
		Optional<String> maxLenghtName = friends.stream().reduce(findName);
		maxLenghtName.ifPresent(System.out::println);
	}

	private static void usingReduceWithDefault(final List<String> friends, String defaultValue) {
		String maxLenghtName = friends.stream().reduce(defaultValue, findName);
	}

	public static BinaryOperator<String> findName = (name1, name2) -> name1.length() >= name2.length() ? name1 : name2;

	private static void getMaxMinSumAvg(final List<String> friends) {
		friends.stream().mapToInt(String::length).sum();
		friends.stream().mapToInt(String::length).max();
		friends.stream().mapToInt(String::length).min();
		friends.stream().mapToInt(String::length).average();
	}
}
