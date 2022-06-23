package com.pool.l5.solid.dip;

import com.pool.l5.solid.dip.solution.BankCard;

public class CreditCard implements BankCard{
	@Override
	public void buyItem(double ammount) {
		System.out.println("Buy using credit card");
	}
}
