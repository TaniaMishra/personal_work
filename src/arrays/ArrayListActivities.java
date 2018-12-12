package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> bjb = new ArrayList<String>();
		ArrayList<Friend> friends = new ArrayList<Friend>();
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		ArrayList<String> students = new ArrayList<String>();
		
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
		
		for (int i = 0; i < friends.size(); i++) {
			Friend person = friends.get(i);
			System.out.println("Age: " + person.getAge());
		}
		
		int min = 50;
		int max = 70;
		
		for (int i = 0; i < 10; i++) {
			int length = min + rand.nextInt(max-min+1);
			int width = min + rand.nextInt(max-min+1);
			recs.add(new Rectangle(length, width));
		}
		
		int removeIndex = rand.nextInt(recs.size());
		Rectangle removed = recs.remove(removeIndex);
		System.out.println(removed.getLength());
		
		for (int i = recs.size()-1; i >= 0; i--) {
			int area = recs.get(i).area();
			System.out.println("Area: " + area);
		}
		
		Rectangle object = recs.remove(recs.size()-1);
		recs.set(0, object);
		
		for (int i = 0; i < recs.size(); i++) {
			System.out.println("Length = " + recs.get(i).getLength());
			System.out.println("Width = " + recs.get(i).getWidth());
		}
		for (int i = 0; i < 50; i++) {
			System.out.println("Enter a student's name:");
			students.add(input.nextLine());
		}
		students.remove(0);
		students.remove(students.size()-1);
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		
		
		
		input.close();
	}
}
