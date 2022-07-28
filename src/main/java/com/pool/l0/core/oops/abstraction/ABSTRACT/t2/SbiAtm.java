package com.pool.l0.core.oops.abstraction.ABSTRACT.t2;

public class SbiAtm implements MoneyTransaction {

	@Override
	public void enterPinnumber() {
		System.out.println("Enter Pin Number");

	}

	@Override
	public void enterAmout() {
		System.out.println("Enter Amount");

	}

	@Override
	public int withdrowAmount() {
		System.out.println("Amount:" + 500);
		return 500;
	}

}
