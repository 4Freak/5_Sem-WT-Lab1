package BSUIR.WT.Lab1.Task12.Classes;

public class Book {
	private String title;
	private String author;
	private int price;
	private static int edition = 0;

	public Book (String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		return (this.title == book.title) && (this.author == book.author) && (this.price == book.price);
	}

	@Override
	public int hashCode() {
		return title.hashCode() + author.hashCode();
	}

	@Override
	public String toString() {
		return String.format("Title = %s \nAuthor = %s \nPrice = %d \nEdition = %d", title, author, price, edition);
	}
}
