package com.pool.featurs8.FI.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateClient {
	public static void main(String[] args) {
		BiPredicate<String, Integer> biPredicate = (textData, lengthLimit) -> {
			return textData.length() == lengthLimit;
		};

		boolean testOne = biPredicate.test("Shiva", 5);
		System.out.println(testOne);

		BiPredicate<String, Integer> dominePrdicate = (name, score) -> {
			return (name.equalsIgnoreCase("google.com") || score == 0);
		};

		List<Domain> domains = Arrays.asList(
												new Domain("google.com", 1), 
												new Domain("i-am-spammer.com", 10),
												new Domain("mkyong.com", 0), 
												new Domain("microsoft.com", 2));

		List<Domain> result = filterBadDomain(domains, dominePrdicate);
		System.out.println(result);
		List<Domain> result2 = filterBadDomain(domains, (domain, score) -> score == 0);
		System.out.println(result2);
		List<Domain> result3 = filterBadDomain(domains, (domain, score) -> domain.startsWith("i") && score > 5);
		System.out.println(result3);
		List<Domain> result4 = filterBadDomain(domains, dominePrdicate.or((domain, x) -> domain.equalsIgnoreCase("microsoft.com")));
		System.out.println(result4);
	}

	private static List<Domain> filterBadDomain(List<Domain> domains, BiPredicate<String, Integer> dominePrdicate) {
		return domains.stream().filter(domain -> dominePrdicate.test(domain.getName(), domain.getScore()))
				.collect(Collectors.toList());
	}
}
