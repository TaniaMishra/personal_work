package searching;

import java.util.Scanner;
import java.util.ArrayList;

public class BookSequential {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the title:");
			String title = input.nextLine();
			System.out.println("Enter the number of pages:");
			int pages = input.nextInt();
			books.add(new Book(title, pages));
		}
		
		for (Book x : books) {
			x.getPages();
		}

	}
}
