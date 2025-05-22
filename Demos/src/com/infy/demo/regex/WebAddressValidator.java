package com.infy.demo.regex;

public class WebAddressValidator {
	String regex= "(http|https)://(www\\.)+\\w+\\.(com|org|net)";    
	public boolean isValidWebAddress(String webAddress){
	        //code here
	        if(regex.matches(webAddress)){
	        return true;
	    }
	        else{
	        return false;}
	}
	}

	class Tester{
	    public static void main (String[] args) {
	        
	        WebAddressValidator web=new WebAddressValidator();
	        String webAddress="https://www.infosys.com";
	        if(web.isValidWebAddress(webAddress)){
	        System.out.println(webAddress+"valid");
	    }
	        else{
	        System.out.println(webAddress+"Invalid");
	        }
	}
	}

