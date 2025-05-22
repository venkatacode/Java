package com.infy.bookmyticket.arr;

public class BookTicket {
	public BookTicket(int movieId, int nOOfTickets) {
		super();
		this.movieId = movieId;
		this.nOOfTickets = nOOfTickets;
	}

	private int movieId;
	private int nOOfTickets;
	private double discount;
	private double totalAmount;
	public boolean flag = true;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getnOOfTickets() {
		return nOOfTickets;
	}

	public void setnOOfTickets(int nOOfTickets) {
		this.nOOfTickets = nOOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void calculateDiscount() {
		if (movieId == 101 || movieId == 103 && nOOfTickets >= 5 && nOOfTickets < 10) {
			setDiscount(15);
		} else if (movieId == 101 || movieId == 103 && nOOfTickets >= 10 && nOOfTickets <= 15) {
			setDiscount(20);
		} else if (movieId == 102 && nOOfTickets >= 5 && nOOfTickets < 10) {
			setDiscount(10);
		} else if (movieId == 102 && nOOfTickets >= 10 && nOOfTickets <= 15) {
			setDiscount(15);
		} else if (movieId == 101 || movieId == 102 || movieId == 103 && nOOfTickets >= 5) {
			setDiscount(0);

		} else {
			flag = false;
			if (!flag) {
				System.out.println("Sorry Invalid MovieId Please check movie id once again");

			}
//			return discount;
		}
		
	}

	public double calculateTicketAmount() {
		calculateDiscount();
		if (totalAmount < 0) {
			return 0;
		} else {
			double baseFare;
			if (movieId == 101) {
				baseFare = 120;
			} else if (movieId == 102) {
				baseFare = 170;
			} else if (movieId == 103) {
				baseFare = 150;
			} else {
				return 0;
			}
			totalAmount = baseFare * nOOfTickets - (baseFare * nOOfTickets * (discount / 100));
			return totalAmount;
		}
	}
}

class Tester {

	public static double display(double bookingnumber, double amount) {
		System.out.println("Total Amount for:" + " " + (int) bookingnumber + " " + (int) amount);
		return 0;
	}

	public static void main(String args[]) {

//		BookTicket b=new BookTicket();
		BookTicket arr[] = new BookTicket[4];
		arr[0] = new BookTicket(101, 5);
		arr[1] = new BookTicket(102, 4);
		arr[2] = new BookTicket(103, 8);
		arr[3] = new BookTicket(104, 4);
		double amount = 0;
		for (int i = 0; i < arr.length; i++) {
			amount = arr[i].calculateTicketAmount();
			display(i + 1, amount);
		}

	}

}