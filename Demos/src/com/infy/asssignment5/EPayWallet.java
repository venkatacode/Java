package com.infy.asssignment5;

public class EPayWallet {

	public static void processPaymentByUser(User user, double billAmount) {

		if (user.makePayment(billAmount)) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Congratulations" + " " + user.getUsername() + " " + "Payment of" + " " + billAmount
					+ " " + "was Successful");
			System.out.println("Your wallet balance is:" + user.getWalletBalance());
		if (user instanceof KYCUser) {
				KYCUser kycuser = (KYCUser) user;
				System.out.print("You have reward points:" + kycuser.getRewardPoints() + "\n");
			}
		}
	}
}
