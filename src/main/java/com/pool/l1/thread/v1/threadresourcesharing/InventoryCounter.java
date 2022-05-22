package com.pool.l1.thread.v1.threadresourcesharing;

public class InventoryCounter {
	private int items = 0;

	public void increamentItem() {
		items++;
	}

	public void decreamentItem() {
		items--;
	}

	public int getItems() {
		return items;
	}

}
