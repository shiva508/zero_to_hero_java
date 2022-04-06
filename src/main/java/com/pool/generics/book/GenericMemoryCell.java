package com.pool.generics.book;

public class GenericMemoryCell<T> {
	private T storedValue;

	public T read() {
		return storedValue;
	}

	public void write(T inputValue) {
		this.storedValue = inputValue;
	}
}
