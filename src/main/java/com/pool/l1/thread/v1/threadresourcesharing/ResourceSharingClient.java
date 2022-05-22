package com.pool.l1.thread.v1.threadresourcesharing;

public class ResourceSharingClient {
	public static void main(String[] args) throws InterruptedException {
		InventoryCounter inventoryCounter = new InventoryCounter();
		IncreamentThread increamentThread = new IncreamentThread(inventoryCounter);
		DecreamentThread decreamentThread = new DecreamentThread(inventoryCounter);
		increamentThread.start();
		decreamentThread.start();
		increamentThread.join();
		decreamentThread.join();

		System.out.println("Number of Inventary Items: " + inventoryCounter.getItems());
	}
}
