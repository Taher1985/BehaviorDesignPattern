package com.design.pattern.client;

import com.design.pattern.behaviorinterfaceimpl.Cash;
import com.design.pattern.behaviorinterfaceimpl.OnlineTransfer;
import com.design.pattern.strategyclass.ShoppingMall;
import com.design.pattern.strategysubclasses.DomescticCustomer;

public class StrategyClient {

	public static void main(String[] args) {

		ShoppingMall mall = new DomescticCustomer();
		mall.customer();
		mall.setList(mall.shopping());
		mall.calculate();
		mall.setPaymentBehavior(new OnlineTransfer());
		mall.performPayment();

		System.out.println("Website not working, Please pay via Cash");

		mall.setPaymentBehavior(new Cash());
		mall.performPayment();

	}

}
