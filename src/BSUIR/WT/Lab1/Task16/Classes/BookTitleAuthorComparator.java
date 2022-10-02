package BSUIR.WT.Lab1.Task16.Classes;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		int result = book1.title.compareTo(book2.title);
		if (result == 0) {
			result = book1.author.compareTo(book2.author);
		}
		return result;
	}
}
