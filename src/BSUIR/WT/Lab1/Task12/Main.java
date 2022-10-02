package BSUIR.WT.Lab1.Task12;

import BSUIR.WT.Lab1.Task12.Classes.Book;

public class Main {

	public static void main(String[] args){
		var book1 = new Book("Piece", "FAT", 4);
		var book2 = new Book("CLR via C#", "Richter", 2000);

		System.out.println("Equals: " + book1.equals(book2));
		System.out.println("Hash 1: " + book1.hashCode());
		System.out.println("Hash 2: " + book2.hashCode());
		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
	}
}
