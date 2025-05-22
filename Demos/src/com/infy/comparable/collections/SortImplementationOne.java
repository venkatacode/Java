package com.infy.comparable.collections;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SortImplementationOne implements Comparator<String>,Comparable<String> {
	

	// Implementation class for the Comparator interface
	

		//compare method overridden 
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}

		@Override
		public int compareTo(String o) {
			
			return 0;
		}
	}

	// Another implementation class for the Comparator interface
	class SortImplementationTwo implements Comparator<String> {

		//compare method overridden
		@Override
		public int compare(String o1, String o2) {
			return o1.length()-o2.length();
		}
	}

	class DemoSort {

		public static void main(String[] args) {
			List<String> employeeNames = Arrays.asList("Rachael","Ross","Monica",
	                "Chandler","Joey","Phoebe");
			
			//Displaying employeeNames before sorting
			System.out.println(employeeNames);
			
			// list.sort() takes the implementation of Comparator interface for inducing the ordering
			Comparator<String> compare1 = new SortImplementationOne();
			employeeNames.sort(compare1);
			
			//Displaying employeeNames after sorting based on natural ordering
			System.out.println(employeeNames);
			
			// list.sort() takes another implementation of Comparator interface for inducing the ordering
			Comparator<String> compare2 = new SortImplementationTwo();
			employeeNames.sort(compare2);
			
			//Displaying employeeNames after sorting based on length of each element
			System.out.println(employeeNames);
			
		//	System.out.println(compare1.compare("Rachel", "Ross"));
		}
	}

