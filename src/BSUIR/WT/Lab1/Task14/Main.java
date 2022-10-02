package BSUIR.WT.Lab1.Task14;

import BSUIR.WT.Lab1.Task14.Classes.Book;

public class Main {

	public static void main(String[] args){
		var book1 = new Book("Piece", "FAT", 4);
		var book2 = book1;

		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
	}
}
