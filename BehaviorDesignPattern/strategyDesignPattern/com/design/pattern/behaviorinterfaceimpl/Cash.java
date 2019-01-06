package com.design.pattern.behaviorinterfaceimpl;

import com.design.pattern.behaviorinterface.PaymentBehavior;

public class Cash implements PaymentBehavior {

	@Override
	public void payment() {
		System.out.println("Payment mode is Cash");
	}

}
