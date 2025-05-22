package com.infy.exception;

public class Validator {
   
	
	public void validate(Applicant applicant) throws InfyBankException{
		//code here
		if(applicant==null){
			throw new InfyBankException("Name should be given");}
			else if(!isValidName(applicant.getApplicantName())){
			throw new InfyBankException("Name is Required");}
			else if(!isValidPost(applicant.getPostApplied())){
			throw new InfyBankException("Invalid Post Exception");}
			else if(!isValidAge(applicant.getApplicantAge())){
			throw new InfyBankException("Invalid Age Exception");}
			else{
			System.out.println(" All the values are valid");}
		}
	
	public boolean isValidName(String name) {
		//code here
		return name!=null && !name.isEmpty();
		
	}
	
	public boolean isValidAge(int age) {
		//code here
		
		return age>18 && age<=35;
	}
	
	public boolean isValidPost(String name) {
		//code here
		
		return name!=null && (name.equals("Probationary Officer")||name.equals("Assistant")||name.equals("Special Cadre Officer"));
	}
	
	
}




