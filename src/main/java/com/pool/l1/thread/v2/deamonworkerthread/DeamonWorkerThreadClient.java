package com.pool.l1.thread.v2.deamonworkerthread;

public class DeamonWorkerThreadClient {
	static class WorkerThread implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(3000);
				System.out.println("WorkerThread Thread is running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static class DeamonThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
					System.out.println("Deamon Thread is running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public static void main(String[] args) {

		DeamonThread deamonThread = new DeamonThread();
		WorkerThread runnerOne = new WorkerThread();

		Thread thread1 = new Thread(deamonThread);
		Thread thread2 = new Thread(runnerOne);

		thread1.setDaemon(true);
		thread1.start();
		thread2.start();

	}
}
