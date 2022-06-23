package com.pool.l5.solid.dip.solution;

import com.pool.l5.solid.dip.CreditCard;
import com.pool.l5.solid.dip.DebitCard;

public class ShopingDipClient {
	private BankCard bankCard;

	public ShopingDipClient(BankCard bankCard) {
		super();
		this.bankCard = bankCard;
	}

	public void doBuyItem(double ammount) {
		this.bankCard.buyItem(ammount);
	}

	public static void main(String[] args) {
		BankCard bankCard = new DebitCard();
		ShopingDipClient shoppingClient = new ShopingDipClient(bankCard);

		shoppingClient.doBuyItem(0);

		BankCard bankCardCredit = new CreditCard();
		ShopingDipClient shoppingCreditClient = new ShopingDipClient(bankCardCredit);

		shoppingCreditClient.doBuyItem(0);
	}
}
