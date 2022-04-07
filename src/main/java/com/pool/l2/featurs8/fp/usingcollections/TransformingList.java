package com.pool.l2.featurs8.fp.usingcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformingList {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		beforeJava8(friends);

		usingJava8(friends);
		for (String friend : friends) {
			if(friend.startsWith("N")) {
				
			}
		}

	}

	private static void usingJava8(final List<String> friends) {
		final List<String> uppercaseNames = new ArrayList<>();
		friends.forEach((friendName) -> uppercaseNames.add(friendName.toUpperCase()));

		List<String> uppercaseNamesLambda = friends.stream().map(friendName -> friendName.toUpperCase())
				.collect(Collectors.toList());

		List<String> uppercaseNamesMathodReferance = friends.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		Integer totalLengthOffriendsName = friends.stream().mapToInt(String::length).sum();
	}

	private static void beforeJava8(final List<String> friends) {
		final List<String> uppercaseNames = new ArrayList<>();

		for (String friendName : friends) {
			uppercaseNames.add(friendName.toUpperCase());
		}
	}
}
