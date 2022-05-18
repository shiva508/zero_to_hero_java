package com.pool.l1.thread.v1.threadcreation.casestudy;

public class VaultTest {
	private int password;

	public VaultTest(int password) {
		this.password = password;
	}

	public boolean inCurrectPassword(int guess) {

		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.password == guess;
	}

	private static abstract class HackerThread extends Thread {
		protected VaultTest vault;

		public HackerThread(VaultTest vault) {
			this.vault = vault;
			this.setName(this.getClass().getSimpleName());
			this.setPriority(MAX_PRIORITY);
		}

		@Override
		public synchronized void start() {
			System.out.println("Starting thread :" + this.getName());
			super.start();
		}

	}

	private static class AscendingHackerThread extends HackerThread {

		public AscendingHackerThread(VaultTest vault) {
			super(vault);
		}

		@Override
		public void run() {
			super.run();
		}
	}

	private static class descendingHackerThread extends HackerThread {

		public descendingHackerThread(VaultTest vault) {
			super(vault);
		}

	}
}
