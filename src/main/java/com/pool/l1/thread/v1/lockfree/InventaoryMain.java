package com.pool.l1.thread.v1.lockfree;

import java.util.concurrent.atomic.AtomicInteger;

public class InventaoryMain {
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
		private AtomicInteger items = new AtomicInteger(0);

		public void increamentItem() {
			items.incrementAndGet();
		}

		public void decreamentItem() {
			items.decrementAndGet();
		}

		public int getItems() {
			return items.get();
		}
	}
}
