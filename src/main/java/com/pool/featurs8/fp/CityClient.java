package com.pool.featurs8.fp;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CityClient {
	public static String cityAscert = "Nizamabad";

	public static void main(String[] args) {

		List<String> cities = List.of("Thalla Malka puram", "Gunjalur", "Nizamabad");

		boolean isCityFound = beforeJava8(cities);
		boolean isCityFoundWay = beforeJava8BetterWay(cities);

		List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
				new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"), new BigDecimal("45"),
				new BigDecimal("12"));

		BigDecimal totalOfDiscountedPricesBeforJava8 = discountPriceCalculationBeforeJava8(prices);
		System.out.println(totalOfDiscountedPricesBeforJava8);
		BigDecimal totalOfDiscountedPricesAfterJava8 = discountPriceCalculationAfterJava8(prices);
		System.out.println(totalOfDiscountedPricesAfterJava8);
	}

	public static BigDecimal discountPriceCalculationAfterJava8(List<BigDecimal> prices) {
		BigDecimal totalOfDiscountedPrices = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO, BigDecimal::add);

		return totalOfDiscountedPrices;
	}

	public static BigDecimal discountPriceCalculationBeforeJava8(List<BigDecimal> prices) {
		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
				totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		return totalOfDiscountedPrices;
	}

	public static boolean beforeJava8BetterWay(List<String> cities) {
		return cities.contains(cities);
	}

	public static boolean beforeJava8(List<String> cities) {
		boolean isCityFound = false;
		for (String city : cities) {
			if (cityAscert.equals(cities)) {
				isCityFound = true;
			}
		}
		return isCityFound;
	}

}
