package oop;

import java.util.Scanner;

public class TestPhone {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Phone bob = new Phone();
		
		System.out.println("What is your phone number? (in the form: 1112223333)");
		bob.setNum(input.nextLong());
		System.out.println("What is your speed dial number? (in the form 1112223333)");
		bob.setSpeedDial(input.nextLong());
		System.out.println("How many calls have you made from your phone?");
		bob.setNumCalls(input.nextLong());
		System.out.println("How many minutes has your phone been in use?");
		bob.setNumMin(input.nextDouble());
		System.out.println("You just made a call!");
		System.out.println("What is the phone number you just called? (in the form 1112223333)");
		long lastCalled = input.nextLong();
		System.out.println("How many minutes were you on the phone?");
		double minutes = input.nextDouble();
		
		bob.makeCall(lastCalled, minutes);
		
		System.out.println("Your phone number: " + bob.getNum());
		System.out.println("Your speed dial number: " + bob.getSpeedDial());
		System.out.println("Emergency number: " + bob.getEmergency());
		System.out.println("Your last call: " + bob.getLastCall());
		System.out.println("Number of calls made: " + bob.getNumCalls());
		System.out.println("Number of minutes your phone has been in use: " + bob.getNumMin());
		
		
		input.close();
	}
}
