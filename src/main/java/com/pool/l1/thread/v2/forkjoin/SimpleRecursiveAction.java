package com.pool.l1.thread.v2.forkjoin;

import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {
	private int simmulatedWork;

	public SimpleRecursiveAction(int simmulatedWork) {
		super();
		this.simmulatedWork = simmulatedWork;
	}

	@Override
	protected void compute() {
		if (simmulatedWork > 100) {
			System.out.println("Parallel processing splitting and ");
			SimpleRecursiveAction action1 = new SimpleRecursiveAction(simmulatedWork / 2);
			SimpleRecursiveAction action2 = new SimpleRecursiveAction(simmulatedWork / 2);
			action1.fork();
			action2.fork();
		} else {
			System.out.println("Size is bit so we can continue sequntially=" + simmulatedWork);
		}
	}

}
