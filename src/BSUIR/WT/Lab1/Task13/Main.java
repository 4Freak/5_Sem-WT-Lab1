package BSUIR.WT.Lab1.Task13;

import BSUIR.WT.Lab1.Task13.Classes.ProgrammerBook;

public class Main {

	public static void main(String[] args){
		var book1 = new ProgrammerBook("Piece", "FAT", 4, "fr", 0);
		var book2 = new ProgrammerBook("CLR via C#", "Richter", 2000, "C#", 9000);

		System.out.println("Equals: " + book1.equals(book2));
		System.out.println("Hash 1: " + book1.hashCode());
		System.out.println("Hash 2: " + book2.hashCode());
		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
	}
}
