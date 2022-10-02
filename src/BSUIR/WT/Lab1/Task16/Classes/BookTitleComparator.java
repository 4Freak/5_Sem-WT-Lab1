package BSUIR.WT.Lab1.Task16.Classes;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		return book1.title.compareTo(book2.title);
	}
}
