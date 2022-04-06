package com.pool.featurs8.FI.biconsumer;

@FunctionalInterface
public interface BiConsumerFunctionalInterface<T, U> {
	void accept(T t, U u);
}
