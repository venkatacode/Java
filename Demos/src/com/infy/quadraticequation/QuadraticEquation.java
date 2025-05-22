package com.infy.quadraticequation;

import java.util.*;
public class QuadraticEquation {
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	System.out.println("Enter a value:"+a);
	double b=sc.nextDouble();
	System.out.println("Enter b value:"+b);
	double c=sc.nextDouble();
	System.out.println("Enter c value:"+c);
	double root1,root2;
	double d=(b*b)-(4*a*c);
	
	if(d>0) {
		
		root1=(-b+(Math.sqrt(d)))/(2*a);
		root2=(-b-(Math.sqrt(d)))/(2*a);
		System.out.println("the roots are real and distinct:"+root1+" "+root2);
	}
	else if(d==0) {
		root1=-b/2*a;
		root2=-b/2*a;
		System.out.println("The roots are equal:"+root1+" "+root2);
	}
	else {
		root1=-b/2*a;
		root2=Math.sqrt(-d)/2*a;
		System.out.println("the roots are not real: "+root1+" "+root2);
	}
	sc.close();
 }
}
