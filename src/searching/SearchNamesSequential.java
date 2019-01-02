package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNamesSequential {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		names[0] = "Bob1";
		names[1] = "Bob2";
		names[2] = "Bob3";
		names[3] = "Bob4";
		names[4] = "Bob5";
		System.out.println("Enter a name:");
		String user = input.next();
		boolean there = false;
		for (String x : names) {
			if (user.equals(x)) {
				there = true;
			}
		}
		System.out.println("Is " + user + " in the array?  " + there);
		
		ArrayList<String> people = new ArrayList<String>();
		people.add("Bob6");
		people.add("Bob7");
		people.add("Bob8");
		people.add("Bob9");
		people.add("Bob10");
		System.out.println("Enter a name:");
		String person = input.next();
		boolean here = false;
		for (String x : people) {
			if (person.equals(x)) {
				here = true;
			}
		}
		System.out.println("Is " + person + " in the ArrayList?  " + here);
		
		input.close();
	}
}
