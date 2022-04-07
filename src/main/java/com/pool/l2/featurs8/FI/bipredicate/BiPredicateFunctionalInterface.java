package com.pool.l2.featurs8.FI.bipredicate;

@FunctionalInterface
public interface BiPredicateFunctionalInterface<T,U> {
	boolean test(T t, U u);
}
