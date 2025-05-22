package com.infy.asssignment5;

public class KYCUser extends User {
	private int rewardPoints;

	public KYCUser(int id, String username, String email, double walletBalance) {
		super(id, username, email, walletBalance);
		this.rewardPoints = rewardPoints;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public boolean makePayment(double billAmount) {

		if (getWalletBalance() > billAmount) {
			if (super.makePayment(billAmount)) {
				rewardPoints += ((int) billAmount * 0.10);
				return true;
			} else {
				return false;
			}
		} else if (billAmount > getWalletBalance()) {
			System.out.println("------------------------------------------");
			System.out.println("Sorry" + " " + getUsername() + " " + "not enough balance");
			System.out.println("Your balance is:" + getWalletBalance());
			System.out.print("You have reward points:" + getRewardPoints());
		}
		return false;

	}

}
