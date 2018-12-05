package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> bjb = new ArrayList<String>();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a name:");
			String name = input.nextLine();
			names.add(name);
		}
		System.out.println("");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("");
		
		bjb.add("Bob");
		bjb.add("Jane");
		bjb.add(0, "Billy");
		System.out.println("What is your name?");
		bjb.add(input.nextLine());
		System.out.println("");
		for (int i = 0; i < bjb.size(); i++) {
			System.out.println(bjb.get(i));
		}
		
		System.out.println("");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a friend's name:");
			String name = input.nextLine();
			System.out.println("Enter a friend's age:");
			int age = input.nextInt();
			friends.add(0, new Friend(name, age));
			input.nextLine();
		}
		input.close();
	}
}
