package com.pool.l1.thread.v1.threadresourcesharing;

public class ResourceSharingBlockSyncClient {
	public static void main(String[] args) throws InterruptedException {
		InventoryCounterBlockSync inventoryCounter = new InventoryCounterBlockSync();
		IncreamentThreadBlockSync increamentThread = new IncreamentThreadBlockSync(inventoryCounter);
		DecreamentThreadBlockSync decreamentThread = new DecreamentThreadBlockSync(inventoryCounter);
		increamentThread.start();
		decreamentThread.start();
		increamentThread.join();
		decreamentThread.join();

		System.out.println("Number of Inventary Items: " + inventoryCounter.getItems());
	}

	private static class DecreamentThreadBlockSync extends Thread {
		private InventoryCounterBlockSync inventoryCounter;

		public DecreamentThreadBlockSync(InventoryCounterBlockSync inventoryCounter) {
			this.inventoryCounter = inventoryCounter;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				inventoryCounter.decreamentItem();
			}
		}
	}

	private static class IncreamentThreadBlockSync extends Thread {
		private InventoryCounterBlockSync inventoryCounter;

		public IncreamentThreadBlockSync(InventoryCounterBlockSync inventoryCounter) {
			this.inventoryCounter = inventoryCounter;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				inventoryCounter.increamentItem();
			}
		}
	}

	private static class InventoryCounterBlockSync {
		private int items = 0;

		public synchronized void increamentItem() {
			synchronized (this) {
				items++;
			}

		}

		public synchronized void decreamentItem() {
			synchronized (this) {
				items--;
			}

		}

		public synchronized int getItems() {
			synchronized (this) {
				return items;
			}
		}

	}

}
