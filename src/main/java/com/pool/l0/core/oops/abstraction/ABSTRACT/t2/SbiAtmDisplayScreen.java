package com.pool.l0.core.oops.abstraction.ABSTRACT.t2;

public class SbiAtmDisplayScreen {
	public static void main(String[] args) {
		MoneyTransaction sbiAtm=new SbiAtm();
		sbiAtm.displayScreenDefault();
		MoneyTransaction.displayScreenStatic();
		sbiAtm.enterPinnumber();
		sbiAtm.enterAmout();
		sbiAtm.withdrowAmount();
	}
}
