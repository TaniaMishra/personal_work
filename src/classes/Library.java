package classes;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> books;
	
	public Library() {
		name = "Brookfield Public Library";
		for (int i = 0; i < 10; i++) {
			books.add(new Book("Harry Potter", 200));
		}
	}
	
	public Library(String xName, ArrayList<Book> xBooks) {
		name = xName;
		books = xBooks;
	}
	
	public void checkOut(int index) {
		books.remove(index);
	}
	
	public void returnBook(String xName, int xPages) {
		books.add(new Book (xName, xPages));
	}
	
	public void fire() {
		books.clear();
	}
}
