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
	
	public String titleToString() {
		return title.toString();
	}
	
	public String cloneTitle() {
		return "CAN'T GET THIS TO WORK!"; //HardDrive.clone();
	}
	
	public boolean titleEquals(String xTitle) {
		if (title.equals(xTitle)) {
			return true;
		}
		else {
			return false;
		}
	}
}
