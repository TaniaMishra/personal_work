package arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WhoIsMyFriend {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		
		boolean keepGoing;
		do {
			System.out.println("Enter a friend's name:");
			String name = input.nextLine();
			System.out.println("Enter their age:");
			int age = input.nextInt();
			friends.add(new Friend(name, age));
			System.out.println("Do you have another friend? (true or false)");
			keepGoing = input.nextBoolean();
		}
		while (keepGoing == true);
		
		int fortune = 1 + rand.nextInt(2);
		
		if (fortune == 1) {	//good fortune
			for (int i = 0; i < friends.size(); i++) {
				System.out.println("Enter a friend's name:");
				String name = input.nextLine();
				System.out.println("Enter their age:");
				int age = input.nextInt();
				friends.add(new Friend(name, age));
			}
		}
		else {	//bad fortune
			int keepFriend = rand.nextInt(friends.size());
			for (int i = 0; i < friends.size(); i++) {
				if (i != keepFriend) {
					friends.remove(i);
				}
			}
		}
		
		System.out.println("Your Friends:");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i).getName());
		}
		
		input.close();
	}
}
