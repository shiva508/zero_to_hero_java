package com.pool.featurs8.FI.bipredicate;

@FunctionalInterface
public interface BiPredicateFunctionalInterface<T,U> {
	boolean test(T t, U u);
}
