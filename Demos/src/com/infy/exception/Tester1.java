package com.infy.exception;

public class Tester1 {
	
		public static void main(String[] args) {
			//code here
			Applicant  applicant=new Applicant();
			applicant.setApplicantName("Jason");
			applicant.setPostApplied("Asssistant");
			applicant.setApplicantAge(35);
			Validator validator=new Validator();
			try{
			validator.validate(applicant);
			}catch(InfyBankException e){
			  System.out.println(e.getMessage());}
		}
}
