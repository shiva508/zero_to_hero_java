package com.pool.featurs8.fp.joiningelements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElements {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		String usngJava8 = friends.stream().collect(Collectors.joining(","));
		String usngJava8Upper = friends.stream().map(String::toUpperCase).collect(Collectors.joining(","));

		beforejava8(friends);
		usingjava8(friends);
		friends.stream().map(String::toUpperCase).collect(Collectors.toList()).stream()
				.map(data -> String.join(",", data));
	}

	private static void usingjava8(final List<String> friends) {
		String concatinatedNames = String.join(",", friends);
		System.out.println(concatinatedNames);
	}

	private static void beforejava8(final List<String> friends) {
		for (int i = 0; i < friends.size(); i++) {
			if ((friends.size() - 1) > i) {
				System.out.println(friends.get(i) + ", ");
			} else {
				System.out.println(friends.get(i));
			}
		}
	}
}
