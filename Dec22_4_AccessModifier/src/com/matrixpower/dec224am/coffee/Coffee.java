package com.matrixpower.dec224am.coffee;

public class Coffee {
	String name;
	int price;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
	}
}
