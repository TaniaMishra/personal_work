package strings;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.next();
		System.out.print("Verify your password: ");
		String verify = input.next();
		
		while (password.equals(verify) != true) {
			System.out.print("Try again. Verify the password: ");
			verify = input.next();
		}

		System.out.println("Awesome! You've created your password!");
		
		input.close();
	}
}
