package com.infy.inheritance;

public class Pizza {
	int price;
	String size;
	int quantity;

	Pizza(String size, int quantity) {
		this.size = size;
		this.quantity = quantity;

		if (this.size.equals("Regular"))
			this.price = 100;
		else if (this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
	}
}
