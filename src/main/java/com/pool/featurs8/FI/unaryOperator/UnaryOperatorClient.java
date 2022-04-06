package com.pool.featurs8.FI.unaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryOperatorClient {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = x -> x.length() * 4;
		Integer result = lengthFunction.apply("MY NAME SHIVA");
		System.out.println(result);

		UnaryOperator<Integer> unaryOperator = x -> x * 4;
		Integer unaryOperatorResult = unaryOperator.apply(408);
		System.out.println(unaryOperatorResult);

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		UnaryOperator<Integer> multiplyUnary = x -> x * 4;
		List<Integer> multipliedRsult = multplie(integerList, multiplyUnary);
		System.out.println(multipliedRsult);
		List<Integer> multipliedRsultTwo = multplie(integerList, multiplyUnary,x->x*8);
		System.out.println(multipliedRsultTwo);

	}

	private static <T> List<T> multplie(List<T> integerList, UnaryOperator<T> multiplyUnary) {
		List<T> supplier=new ArrayList<>();
		for(T t:integerList) {
			supplier.add(multiplyUnary.apply(t));
		}
		
		return supplier;
	}

	private static <T> List<T> multplie(List<T> integerList, UnaryOperator<T> multiplyUnary,UnaryOperator<T> multiplyUnarytwo) {
		List<T> supplier=new ArrayList<>();
		for(T t:integerList) {
			supplier.add(multiplyUnary.andThen(multiplyUnarytwo).apply(t));
		}
		return supplier;
	}
}
