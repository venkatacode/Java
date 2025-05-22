package com.infy.staticdemo;

public class Book {
	
		String bookId;
		String bookName;
		//This is a Static variable which stores the total noOfBooks that InfyLibrary has.
		private static Integer noOfBooks=1000;

		//Whenever a new Book object is created, a bookId is generated and the noOfBooks increases by 1.
		public Book(String bookName) {
			noOfBooks++;
			this.bookId="B"+noOfBooks;
			this.bookName=bookName;
		}
		//This static method is used to return the total noOfBooks that the library has.
		public static Integer getNoOfBooks() {
			return noOfBooks;
		}
	}

	class InfyLibraryApplication {
		public static void main(String[] args) {
			System.out.println("Total number of books in the library currently are: "+Book.getNoOfBooks());
			Book b1=new Book("The Alchemist");
			System.out.println("BookName: "+b1.bookName+" ; bookId: "+b1.bookId);
			Book b2=new Book("The Hunger Games");
			System.out.println("BookName: "+b2.bookName+" ; bookId: "+b2.bookId);
			System.out.println("Total number of books in the library currently are: "+Book.getNoOfBooks());
		}
	}

