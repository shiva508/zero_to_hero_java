package com.pool.l1.thread.v2.parllalization;

public class MergeSort {
	private int[] nums;
	private int[] temparary;

	public MergeSort(int[] nums) {
		super();
		this.nums = nums;
		temparary = new int[nums.length];
	}

	public void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void sort() {
		mergeSort(0, nums.length - 1);
	}

	public void mergeSort(int low, int high) {
		if (low >= high) {
			return;
		}
		int middleIndex = (low + high) / 2;
		mergeSort(low, middleIndex);
		mergeSort(middleIndex + 1, high);
		merge(low, middleIndex, high);
	}

	public void merge(int low, int middleIndex, int high) {
		for (int i = low; i <= high; i++) {
			temparary[i] = nums[i];
		}
		int i = low;
		int j = middleIndex + 1;
		int k = low;
		while ((i <= middleIndex) && (j <= high)) {
			if (temparary[i] <= temparary[j]) {
				nums[k] = temparary[i];
				++i;
			} else {
				nums[k] = temparary[j];
				++j;
			}
			++k;
		}
		while (i <= middleIndex) {
			nums[k] = temparary[i];
			++i;
			++k;
		}

		while (j <= middleIndex) {
			nums[k] = temparary[j];
			++j;
			++k;
		}
	}

	public void showArray() {
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "]=" + nums[i]);
		}
	}
}
