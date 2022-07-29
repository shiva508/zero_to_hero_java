package com.pool.l0.core.oops.abstraction.ABSTRACT.t2;

public interface MoneyTransaction {
	final int a = 10;

	public abstract void enterPinnumber();

	public void enterAmout();

	public abstract int withdrowAmount();

	public abstract int withdrowAmount(String playername);

	public default void displayScreenDefault() {
		System.out.println("Static Method");
	}

	public static void displayScreenStatic() {
		System.out.println("DEfalut method");
	}
}
