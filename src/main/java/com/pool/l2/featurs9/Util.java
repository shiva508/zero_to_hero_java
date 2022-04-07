package com.pool.l2.featurs9;

public interface Util {
	public Integer getBunberOfCource();

	default Integer getBunberOfCourceDefault() {
		return defaultHelper();
	}

	private int defaultHelper() {
		return 508;
	}

	static Integer getBunberOfCourceStatic() {
		return staticHelper();
	}

	private static int staticHelper() {
		return 408;
	}
}
