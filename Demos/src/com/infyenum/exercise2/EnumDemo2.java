package com.infyenum.exercise2;

enum Category {
	MOBILE,TABLET,COMPUTER,LAPTOP
}
public class EnumDemo2 {

	
		private double amount;
		private Category type;
		private double discount;
		EnumDemo2(double amount,Category type){
			this.amount=amount;
			this.type=type;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}

		public Category getType() {
			return type;
		}

		public void checkDiscountApplicability(double amount,Category type)
		{
			if(amount>=30000){
				System.out.println("congratulations you are applicable for discount:"+getDiscount());
			}
			else if(amount>=35000.0){
			System.out.println("congratulations you are applicable for discount:"+getDiscount());
				}
			else if(amount>=35000.0){
			System.out.println("congratulations you are applicable for discount:"+getDiscount());
				}
			else {
				
				System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
			}
		}
		public void applyDiscount(Category type) {
			//write your logic here
			switch(getType()){
			case MOBILE:
			setDiscount(15.0);
			break;
			case TABLET:
			setDiscount(10.0);
			break;
			case LAPTOP:
			setDiscount(8.0);
			break;
			default:
			setDiscount(7.0);
			}
			
		}


	}
	class Tester {

		public static void main(String[] args) {
			EnumDemo2 shop=new EnumDemo2(35000.0,Category.MOBILE);
	        shop.applyDiscount(shop.getType());
		    shop.checkDiscountApplicability(shop.getAmount(),shop.getType());
		}

	}


	

