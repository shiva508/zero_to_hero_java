package com.pool.l1.thread.v1.threadresourcesharing;

public class ResourceSharingMethodSyncClient {
	public static void main(String[] args) throws InterruptedException {
		InventoryCounterSync inventoryCounter = new InventoryCounterSync();
		IncreamentThreadSync increamentThread = new IncreamentThreadSync(inventoryCounter);
		DecreamentThreadSync decreamentThread = new DecreamentThreadSync(inventoryCounter);
		increamentThread.start();
		decreamentThread.start();
		increamentThread.join();
		decreamentThread.join();

		System.out.println("Number of Inventary Items: " + inventoryCounter.getItems());
	}

	private static class DecreamentThreadSync extends Thread {
		private InventoryCounterSync inventoryCounter;

		public DecreamentThreadSync(InventoryCounterSync inventoryCounter) {
			this.inventoryCounter = inventoryCounter;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				inventoryCounter.decreamentItem();
			}
		}
	}

	private static class IncreamentThreadSync extends Thread {
		private InventoryCounterSync inventoryCounter;

		public IncreamentThreadSync(InventoryCounterSync inventoryCounter) {
			this.inventoryCounter = inventoryCounter;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				inventoryCounter.increamentItem();
			}
		}
	}

	private static class InventoryCounterSync {
		private int items = 0;

		public synchronized void increamentItem() {
			items++;
		}

		public synchronized void decreamentItem() {
			items--;
		}

		public synchronized int getItems() {
			return items;
		}

	}

}
