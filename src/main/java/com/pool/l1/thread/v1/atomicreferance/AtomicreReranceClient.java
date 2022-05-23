package com.pool.l1.thread.v1.atomicreferance;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicreReranceClient {
	public static void main(String[] args) {
		String oldName = "Shiva";
		String newName = "Batman";
		AtomicReference<String> atomicReference = new AtomicReference<String>(oldName);
		atomicReference.set("Moon Knight");
		if (atomicReference.compareAndSet(oldName, newName)) {
			System.out.println("New value :" + atomicReference.get());
		} else {
			System.out.println("Nothing changged !");
		}
	}
}
