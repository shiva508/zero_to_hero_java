package com.pool.l2.featurs8.stream.reduce;

import java.util.Arrays;

public class StreamReduceClient {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=Arrays.stream(numbers).reduce(0, (x,y)->x+y);
		System.out.println(sum);
		int methodReferanceSum=Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println(methodReferanceSum);
		int methodReferancemin=Arrays.stream(numbers).reduce(0, Integer::min);
		System.out.println(methodReferancemin);
		int methodReferancemax=Arrays.stream(numbers).reduce(0, Integer::max);
		System.out.println(methodReferancemax);
	}
}
