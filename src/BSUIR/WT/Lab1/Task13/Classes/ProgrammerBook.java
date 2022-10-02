package BSUIR.WT.Lab1.Task13.Classes;

import BSUIR.WT.Lab1.Task12.Classes.Book;

public class ProgrammerBook extends Book {

	private String language;
	private int level;

	public ProgrammerBook(String title, String author, int price, String language, int level) {
		super(title, author, price);
		this.language = language;
		this.level	= level;
	}

	@Override
	public boolean equals(Object obj) {
		var programmerBook = (ProgrammerBook)obj;
		return super.equals(obj) && (this.language == programmerBook.language) && (this.level == programmerBook.level);
	}

	@Override
	public int hashCode() {
		return language.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + "\nLanguage: " + language + "\nLevel: " + level;
	}
}
