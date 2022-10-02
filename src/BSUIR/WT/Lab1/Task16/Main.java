package BSUIR.WT.Lab1.Task16;

import BSUIR.WT.Lab1.Task16.Classes.Book;
import BSUIR.WT.Lab1.Task16.Classes.BookAuthorTitleComparator;
import BSUIR.WT.Lab1.Task16.Classes.BookTitleAuthorComparator;
import BSUIR.WT.Lab1.Task16.Classes.BookTitleComparator;

public class Main {
	public static void main(String[] args){
		var book1 = new Book("Piece", "FAT", 4, 1);
		var book2 = new Book("CLR via C#", "Richter", 2000, 2);

		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);

		var authorTitlePriceComparator = new BookAuthorTitleComparator();
		var authorTitleComparator = new BookAuthorTitleComparator();
		var titleAuthorComparator = new BookTitleAuthorComparator();
		var titleComparator = new BookTitleComparator();

		System.out.println("Author title price: " + authorTitlePriceComparator.compare(book1, book2));
		System.out.println("Author title: " + authorTitleComparator.compare(book1, book2));
		System.out.println("Title author: " + titleAuthorComparator.compare(book1, book2));
		System.out.println("Title: " + titleComparator.compare(book1, book2));
	}
}
