package com.pool.l4.datastracture.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class CustomArray {
	private int[] data = null;
	private int length = 0;
	private int capacity = 10;

	public CustomArray(int[] data, int length, int capacity) {
		this.data = data;
		this.length = length;
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		int[] arrayData = { 1, 2, 3, 4, 5, 6, 7 };
		CustomArray customArray = new CustomArray(arrayData, 7, 10);
		customArray.push(8);
		customArray.displayArray();
		customArray.pop();
		customArray.displayArray();
		customArray.addAt(408, 4);
		customArray.displayArray();
	}

	private void addAt(int element, int index) {
		arrayResizeAndCopy();
		this.length++;
		for (int i = this.length; i >= index; i--) {
			this.data[i] = this.data[i - 1];
		}

	}

	private void pop() {
		int[] newArray = new int[this.capacity];
		for (int i = 0; i < this.length - 1; i++) {
			newArray[i] = this.data[i];
		}
		this.length--;
	}

	private void displayArray() {
		System.out.println("Length:" + this.length);
		IntStream.of(data).limit(this.length).boxed().toList().forEach(data -> {
			System.out.println(data);
		});
	}

	private void push(int newElement) {
		arrayResizeAndCopy();
		this.data[this.length] = newElement;
		this.length++;
	}

	private void arrayResizeAndCopy() {
		if (this.length + 1 < this.capacity) {
			this.capacity *= 2;
			int[] newArray = new int[this.capacity];
			for (int i = 0; i < this.length; i++) {
				newArray[i] = this.data[i];
			}
			this.data = newArray;
		}

	}
}
