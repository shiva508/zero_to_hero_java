package com.pool.featurs8.fp.designing.delegate;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNAV {
	private Function<String, BigDecimal> priceFinder;

	public CalculateNAV(Function<String, BigDecimal> priceFinder) {
		this.priceFinder = priceFinder;
	}

	public BigDecimal computeStockWorth(final String ticker, final int shares) {
		return null;
	}
}
