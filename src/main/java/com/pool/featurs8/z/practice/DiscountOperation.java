package com.pool.featurs8.z.practice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DiscountOperation {
	public static void main(String[] args) {
		List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
				new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"), new BigDecimal("45"),
				new BigDecimal("12"));
		beforeJava8(prices);
		afterJava8(prices);
	}

	private static void afterJava8(List<BigDecimal> prices) {
		BigDecimal discountAmount=BigDecimal.ZERO;
		Predicate<BigDecimal> discountCondition=price->price.compareTo(BigDecimal.valueOf(20))>0;
		discountAmount=prices.stream().filter(discountCondition).map(price->price.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO,BigDecimal::add);
		System.out.println("discountAmmount-java8:"+discountAmount);
	}

	// GRESTER THAN 20
	private static void beforeJava8(List<BigDecimal> prices) {
		BigDecimal discountAmmount = BigDecimal.ZERO;
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
				discountAmmount=discountAmmount.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		System.out.println("discountAmmount:"+discountAmmount);
	}
}
