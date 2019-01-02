package breakReview;

import java.util.Scanner;

public class Teachers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[120];
		
		System.out.println("Enter the teachers' names (First Last):");
		for (int i = 0; i < names.length; i++) {
			names[i] = input.nextLine();
		}
		
		for (int i = names.length-1; i >= 0; i--) {
			char first = names[i].charAt(0);
			int space = names[i].indexOf(' ');
			char last = names[i].charAt(space+1);
			System.out.println(first + "" + last);
		}
		
		input.close();
	}
}
