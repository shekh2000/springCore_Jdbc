package com.springcore.lifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("inside set");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init");
	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}
}
