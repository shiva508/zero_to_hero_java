package com.pool.l5.interview.array;

public class FindLargestSmallestNumberMain {
	public static void main(String[] args) {
		int arr[] = new int[] { 12, 56, 76, 0, 89, 100, 343, 21, 234 };
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			} else if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("smallest:" + smallest);
		System.out.println("largest:" + largest);
	}
}
