package com.pool.featurs8.FI.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerClieant {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (numberOne, numberTwo) -> System.out.println(numberOne + numberTwo);
		biConsumer.accept(508, 408);
	}
}
