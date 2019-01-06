package com.design.pattern.strategyclass;

import java.util.List;

import com.design.pattern.behaviorinterface.PaymentBehavior;
import com.design.pattern.model.Product;

public abstract class ShoppingMall {

	public double amount;
	public PaymentBehavior paymentBehavior;
	public List<Product> list;

	public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
		this.paymentBehavior = paymentBehavior;
	}

	public void performPayment() {
		paymentBehavior.payment();
	}

	public abstract void customer();

	public abstract List<Product> shopping();

	public void calculate() {
		for (Product product : list) {
			amount += product.getPrice();
		}
		System.out.println("Total amount for " + list.size() + " product is "
				+ amount);
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
}
