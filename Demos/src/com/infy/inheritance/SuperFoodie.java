package com.infy.inheritance;

public class SuperFoodie extends Foodie {

	public double discount;

	public SuperFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount) {
		super(foodieId, foodieName, city, mobileNo);
		this.discount = discount;
	}

	public void calculateTotalPriceWithDiscount(Pizza[] pizzaList) {
		this.calculateTotalPrice(pizzaList);
		this.totalPrice -= totalPrice * (discount / 100);
	}
	// respective getter and setter methods

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
