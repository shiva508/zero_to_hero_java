package com.pool.l4.datastracture.array;

public class ArrayOperations {
	public static void main(String[] args) {
		int[] inputDataFeedArray = new int[100];
		addingDataToArray(inputDataFeedArray, 10);
		addingNewElementIntheMiddle(inputDataFeedArray, 200, 5);
		displayElements(inputDataFeedArray);
	}

	private static void displayElements(int[] inputDataFeedArray) {
		for (int i = 0; i < inputDataFeedArray.length; i++) {
			System.out.println(inputDataFeedArray[i]);
		}

	}

	private static int[] addingNewElementIntheMiddle(int[] inputDataFeedArray, int element, int index) {
		int[] inputDataFeedArraynew = new int[100];
		for (int i = 0; i < inputDataFeedArray.length; i++) {

			if (i == index) {
				inputDataFeedArraynew[i] = element;
			} else if (i < index) {
				inputDataFeedArraynew[i] = inputDataFeedArray[i];
			} else if (i > index) {
				inputDataFeedArraynew[i] = inputDataFeedArray[i - 1];
			}
		}
		inputDataFeedArray = inputDataFeedArraynew;
		return inputDataFeedArraynew;
	}

	private static void addingDataToArray(int[] inputDataFeedArray, int length) {
		for (int j = 0; j < length; j++) {
			inputDataFeedArray[j] = j + 1;
		}
	}
}
