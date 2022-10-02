package BSUIR.WT.Lab1.Task15.Classes;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int price;

	final int isbn;
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

	@Override
	public int compareTo(Book book) {
		return this.isbn - book.isbn;
	}
}