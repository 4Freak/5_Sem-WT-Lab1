package BSUIR.WT.Lab1.Task14.Classes;

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
	public String toString() {
		return String.format("Title = %s \nAuthor = %s \nPrice = %d \nEdition = %d", title, author, price, edition);
	}

	@Override
	protected Object clone(){
		return new Book(this.title, this.author, this.price);
	}
}
