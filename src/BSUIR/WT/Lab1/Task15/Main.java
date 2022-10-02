package BSUIR.WT.Lab1.Task15;

import BSUIR.WT.Lab1.Task15.Classes.Book;

public class Main {

	public static void main(String[] args){
		var book1 = new Book("Piece", "FAT", 4, 1);
		var book2 = new Book("CLR via C#", "Richter", 2000, 2);

		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
		System.out.println("Result: " + book1.compareTo(book2));
	}
}