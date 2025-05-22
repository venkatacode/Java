package com.infy.finalkeyword;

public final class Movie {
	
		final String name="The Godfather";
		void watchMovie(){
			//name="Chinatown"; 
			//Uncomment the above line
			//This throws a compilation error saying "final field 'movies' cannot be reassigned" 
			System.out.println("Movie Name: "+name);
		}
		
		final int shows;  // (blank/unassigned) final variable
		public Movie(){
			shows=400;   
			//The unassigned final variable can be assigned a value only in the constructor
			System.out.println("Total shows: "+shows);
		}
		
		static final float price;  // static blank final variable
		static{
			price=200.25f;
			// The unassigned static final variable can be assigned a value only in a static block
			System.out.println("Price: "+Movie.price);
		}
		
	}
	class Tester{
		public static void main(String[] args) {
			Movie movie=new Movie();
			movie.watchMovie();
		}
	}



