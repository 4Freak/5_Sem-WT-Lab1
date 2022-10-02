package BSUIR.WT.Lab1.Task16.Classes;

public class Book {
	public final String title;
	public final String author;
	public final int price;

	public final int isbn;
	private static int edition = 0;

	public Book (String title, String author, int price, int isbn){
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return String.format("Title = %s \nAuthor = %s \nPrice = %d \nEdition = %d \nisbn = %d", title, author, price, edition, isbn);
	}
}