package com.design.pattern.model;

public class Product {

	public String product;
	public double price;

	public Product(String product, double price) {
		super();
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
