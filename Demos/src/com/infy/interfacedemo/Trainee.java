package com.infy.interfacedemo;

public class Trainee implements Student {
	
		private int  marksSecured;
		public Trainee(int marksSecured){
		this.marksSecured=marksSecured;
		}
		public void calcPercentage(){
		double total=(double)(marksSecured)/(Student.Total/100);
		System.out.println(""+total);
		}
		}

