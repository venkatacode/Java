package com.infy.interfacedemo;

public  class Intern implements Student {
	
		private int  marksSecured;
		private int projectMarks;

		public Intern(int marksSecured,int projectMarks){
		this.marksSecured=marksSecured;
		this.projectMarks=projectMarks;
		}
		
		public void calcPercentage(){
		double total=(marksSecured+projectMarks)/(Student.Total/100);
		System.out.println(""+total);
		}
}
