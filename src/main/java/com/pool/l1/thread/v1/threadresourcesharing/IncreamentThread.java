package com.pool.l1.thread.v1.threadresourcesharing;

public class IncreamentThread extends Thread {
	private InventoryCounter inventoryCounter;

	public IncreamentThread(InventoryCounter inventoryCounter) {
		this.inventoryCounter = inventoryCounter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			inventoryCounter.increamentItem();
		}
	}
}
