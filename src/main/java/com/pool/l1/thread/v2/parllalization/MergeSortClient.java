package com.pool.l1.thread.v2.parllalization;

public class MergeSortClient {
	public static void main(String[] args) {
		int[] nums = { 5, -1, 0, 7, 2, 3, 2, 10, 1, 2 };
		MergeSort mergeSort = new MergeSort(nums);
		mergeSort.sort();
		mergeSort.showArray();
	}
}
