package com.pool.featurs8.stream.mapFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMapClient {
	public static void main(String[] args) {
		mapProcessor();
		flatMapProcessor();
	}

	private static void flatMapProcessor() {
		String[][] array=new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		  // array to a stream
		  Stream<String[]> stream1 = Arrays.stream(array);
		  System.out.println(stream1);
		  // same result
		  Stream<String[]> stream2 = Stream.of(array);
		  System.out.println(stream2.toString());
		
	}

	private static void mapProcessor() {
		List<String> stringInteger = Arrays.asList("1", "2", "3", "4");
		List<Integer> integerValues = stringInteger.stream().map(Integer::valueOf).collect(Collectors.toList());
	}
}
