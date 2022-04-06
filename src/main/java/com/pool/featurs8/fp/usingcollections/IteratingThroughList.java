package com.pool.featurs8.fp.usingcollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratingThroughList {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		beforeJava8(friends);
		usingJava8(friends);

	}

	private static void usingJava8(final List<String> friends) {
		friends.forEach(new Consumer<String>() {

			@Override
			public void accept(String friendName) {
				System.out.println(friendName);
			}
		});

		// less code
		friends.forEach((String friendName) -> System.out.println(friendName));
		
		friends.forEach((friendName) -> System.out.println(friendName));
		friends.forEach(System.out::println);
	}

	private static void beforeJava8(final List<String> friends) {
		for (int nameIndex = 0; nameIndex < friends.size(); nameIndex++) {
			System.out.println(friends.get(nameIndex));
		}

		for (String friendName : friends) {
			System.out.println(friendName);
		}
	}
}
