package com.pool.featurs8.FI.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClient {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		Consumer<Integer> intConsumer = (Integer x) -> System.out.println(x);
		System.out.println("======================================================");
		forEachInteger(integerList, intConsumer);
		forEachInteger(integerList, (Integer x) -> System.out.println(x));
		System.out.println("======================================================");
		List<String> stringList = Arrays.asList("a", "ab", "abc");
		Consumer<String> length=(String text)->System.out.println(text.length());
		forEachLength(stringList,length);
	}

	private static <T> void forEachLength(List<T> stringList, Consumer<T> length) {
		for(T t:stringList) {
			length.accept(t);
		}
	}

	private static <T> void forEachInteger(List<T> integerList, Consumer<T> intConsumer) {
		for (T t : integerList) {
			intConsumer.accept(t);
		}
	}
}
