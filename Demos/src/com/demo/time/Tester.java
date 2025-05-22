package com.demo.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Tester {

	public static void main(String[] args) {
		LocalTime current = LocalTime.now();
		System.out.println("Current Time :- " + current);
		System.out.println("Current Time :- " + current.getHour());

		

		System.out.println();
		System.out.println("************" + "of()" + "************");
		System.out.println("LocalTime.of(2, 55, 29) :- " + LocalTime.of(2, 55, 29));
		/*
		 * of(int hour, int minute, int second, int nanoOfSecond) (mandatory) hour =>
		 * the hour-of-day to represent, from 0 to 23 (mandatory) minute => the
		 * minute-of-hour to represent, from 0 to 59 (optional) second => the
		 * second-of-minute to represent, from 0 to 59 (optional) nanoOfSecond => the
		 * nano-of-second to represent, from 0 to 999,999,999
		 */

		System.out.println();
		System.out.println("************" + "Functions to access date information" + "************");
		System.out.println("What is the current hour going on .... ? :- " + LocalTime.now().getHour());
		/*
		 * Try with different scenarios with functions such as getMinute(),getNano()
		 * etc.
		 */

		System.out.println();
		System.out.println("************" + "LocalTime Calculations" + "************");
		System.out.println("Time after 20 hours ?	 => " + LocalTime.now().plusHours(20));

		/*
		 * Try with different scenarios with functions such as
		 * plusMinutes(),plusSeconds() etc.
		 */

		System.out.println();
		System.out.println("************" + "Difference using ChrnoUnit" + "************");
		LocalTime timeObj = LocalTime.of(11, 20);
		System.out.println(
				"Difference Between current time and timeObj :- " + ChronoUnit.HOURS.between(LocalTime.now(), timeObj));

		/*
		 * 
		 * Exercise :- Thomas has to board train departing at 8:00 PM, You have to check
		 * whether he will be able to board or not. It takes him 2.5 hrs to reach the
		 * station and further 15 mins to reach the platform. Before what time should he
		 * leave his house in order to board the train ? (Hint :- You can use isAfter()
		 * and isBefore() methods, take reference from LocalDate tryout)
		 * 
		 */

		LocalTime time = LocalTime.of(20, 0);
		long Hour = 21 ;
		long Station = 45;
		LocalTime Total = time.minusHours(Hour).minusMinutes(Station);
		System.out.println("" + Total);
		if (time.isBefore(Total)) {
			System.out.print("Train was already left");
		} else if (time.isAfter(Total)) {
			System.out.println("Still time left to catch the train");
		} else {
			System.out.println("Already in the train");
		}
	}
	

}
