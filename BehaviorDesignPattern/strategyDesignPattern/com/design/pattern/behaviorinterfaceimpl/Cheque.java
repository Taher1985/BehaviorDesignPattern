package com.design.pattern.behaviorinterfaceimpl;

import com.design.pattern.behaviorinterface.PaymentBehavior;

public class Cheque implements PaymentBehavior {

	@Override
	public void payment() {
		System.out.println("Payment mode is Cheque");
	}

}
