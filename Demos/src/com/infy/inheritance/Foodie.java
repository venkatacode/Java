package com.infy.inheritance;

public class Foodie {

	public int foodieId;
	public String foodieName;
	public String city;
	public long mobileNo;
	public double totalPrice;

	public Foodie(int foodieId, String foodieName, String city, long mobileNo) {
		this.foodieId = foodieId;
		this.foodieName = foodieName;
		this.city = city;
		this.mobileNo = mobileNo;
	}

	public void calculateTotalPrice(Pizza[] pizzaList) {
		for (Pizza pizza : pizzaList) {
			totalPrice += pizza.price * pizza.quantity;
		}
	}
	// respective getter and setter functions

	public int getFoodieId() {
		return foodieId;
	}

	public void setFoodieId(int foodieId) {
		this.foodieId = foodieId;
	}

	public String getFoodieName() {
		return foodieName;
	}

	public void setFoodieName(String foodieName) {
		this.foodieName = foodieName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
