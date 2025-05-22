package com.infy.asssignment5;

public class Tester {
	public static void main(String[] args) {
		User user = new User(101, "Jack", "jack@infy.com", 1000);
		KYCUser kycuser = new KYCUser(201, "jill", "jill@infy.com", 3000);
		EPayWallet.processPaymentByUser(user, 700);
		EPayWallet.processPaymentByUser(kycuser, 1500);
		EPayWallet.processPaymentByUser(kycuser, 800);
		EPayWallet.processPaymentByUser(kycuser, 1200);

	}
}
