package com.pool.l2.featurs8.fp.pickingelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickElementClient {
	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
		String startingLetter = "N";
		pickName(friends, startingLetter);
		pickNameWithJava8(friends, startingLetter);
	}

	private static void pickName(List<String> names, String startingLetter) {
		String foundName = null;
		for (String name : names) {
			if (name.startsWith(startingLetter)) {
				foundName = name;
				break;
			}
		}
		if (foundName != null) {
			System.out.println("Found name :" + foundName);
		} else {
			System.out.println("Not found name :" + foundName);
		}

	}

	private static void pickNameWithJava8(List<String> names, String startingLetter) {
		final Optional<String> foundNameptional = names.stream().filter(startWithName(startingLetter)).findFirst();
		foundNameptional.orElse("NO NAME FOUND WITH THAT NAME");
		foundNameptional.ifPresent(System.out::println);

	}

	public static Predicate<String> startWithName(String letter) {
		return name -> name.startsWith(letter);
	}

	public Function<String, Predicate<String>> startWithPredicate = (letter) -> name -> name.startsWith(letter);
}
