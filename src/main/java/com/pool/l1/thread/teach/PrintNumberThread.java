package com.pool.l1.thread.teach;

public class PrintNumberThread extends Thread {
	private String squalnceName;
	
	public PrintNumberThread(String squalnceName) {
		this.squalnceName = squalnceName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(squalnceName + ":" + i);
			/*
			 * try { PrintNumberThread.sleep(1000); } catch (InterruptedException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
}
