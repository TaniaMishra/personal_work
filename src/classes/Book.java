package classes;

public class Book {
	private String title;
	private int pages;
	
	public Book() {
		title = "Title";
		pages = 10;
	}
	
	// @ xPages has to be greater than 0
	public Book(String xTitle, int xPages) {
		title = xTitle;
		if (xPages > 0) {
			pages = xPages;
		}
		else {
			pages = 10;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String toString() {
		return "Book Class: title - " + title + " & pages - " + pages;
	}
	
	public Book clone() {
		return new Book(title, pages);
	}
	
	public boolean equals(Book book) {
		if (this.toString().equals(book.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
}
