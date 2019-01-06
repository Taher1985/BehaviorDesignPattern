package com.design.pattern.strategysubclasses;

import java.util.ArrayList;
import java.util.List;

import com.design.pattern.model.Product;
import com.design.pattern.strategyclass.ShoppingMall;

public class RetailCustomer extends ShoppingMall {

	@Override
	public void customer() {
		System.out.println("Customer is Retail");
	}

	@Override
	public List<Product> shopping() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Oil", 74.9));
		list.add(new Product("Deo", 345.9));
		list.add(new Product("Cookies", 653.4));
		list.add(new Product("Groceries", 744.3));
		return list;
	}
}
