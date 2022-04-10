package com.pool.l4.datastracture.array;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterator<T> {
	private T[] arr;
	private int len = 0;
	private int capacity = 0;

	public DynamicArray() {
		this(16);
	}

	public DynamicArray(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException(" Lilligal Capacity :" + capacity);
		}
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public T get(int index) {
		return arr[index];
	}

	public void set(int index, T elem) {
		arr[index] = elem;
	}

	public void clear() {
		for (int i = 0; i < capacity; i++) {
			arr[i] = null;
		}
		len = 0;
	}

	public void add(T elem) {
		if (len + 1 >= capacity) {
			if (capacity == 0) {
				capacity = 1;
			} else {
				capacity *= 2;
			}
		}
		T[] new_arr = (T[]) new Object[capacity];
		for (int i = 0; i < len; i++) {
			new_arr[i] = arr[i];
		}
		new_arr[len++] = elem;
	}

	public T removeIt(int rm_index) {
		if (rm_index >= len && rm_index < 0) {
			throw new ArrayIndexOutOfBoundsException(" out of index exception:" + rm_index);
		}
		T data = arr[rm_index];
		T[] new_arr = (T[]) new Object[len - 1];
		for (int i = 0, j = 0; i < len; i++, j++) {
			if (i == rm_index) {
				j--;
			} else {
				new_arr[i] = arr[i];
			}
		}
		arr = new_arr;
		return null;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public T next() {
		return null;
	}

}
