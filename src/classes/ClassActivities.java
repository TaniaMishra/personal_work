package classes;

import java.util.Scanner;
import java.util.ArrayList;

public class ClassActivities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> greeters = new ArrayList<Greeter>();
		Greeter bob = new Greeter();
		Greeter bill = new Greeter(11);

		System.out.println("Bob: " + bob.getAge());
		System.out.println("Bill: " + bill.getAge());
		
		System.out.println("How many greeters would you like?");
		int number = input.nextInt();
		
		for (int i = 0; i < number; i++) {
			greeters.add(new Greeter());
		}
		
		for (Greeter x : greeters) {
			System.out.println("Age: " + x.getAge());
		}
		
		input.close();
	}
}
