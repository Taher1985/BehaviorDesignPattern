package com.design.pattern.behaviorinterfaceimpl;

import com.design.pattern.behaviorinterface.PaymentBehavior;

public class OnlineTransfer implements PaymentBehavior {

	@Override
	public void payment() {
		System.out.println("Payment mode is Online Transfer");
	}

}
