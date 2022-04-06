package com.pool.featurs8.FI.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClient {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect=list.stream().filter(num->num>5).collect(Collectors.toList());
		System.out.println(collect);
		Predicate<Integer> greaterThan5=x->x>5;
		List<Integer> collectPredicate=list.stream().filter(greaterThan5).collect(Collectors.toList());
		System.out.println(collectPredicate);
		Predicate<Integer> lessThan8=x->x<8;	
		//PREDICATE-AND
		List<Integer> collectTwoPredicate=list.stream().filter(greaterThan5.and(lessThan8)).collect(Collectors.toList());
		System.out.println(collectTwoPredicate);
		//PREDICATE-OR
		Predicate<String> strLength=x->x.length()==3;
		Predicate<String> startWith=x->x.startsWith("A");
		List<String> listString = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		List<String> collrectPredicateOr=listString.stream().filter(strLength.or(startWith)).collect(Collectors.toList());
		System.out.println(collrectPredicateOr);
		//PREDICATE_NEGATE
		List<String> collrectPredicateNagate=listString.stream().filter(startWith.negate()).collect(Collectors.toList());
		System.out.println(collrectPredicateNagate);
	}
}
