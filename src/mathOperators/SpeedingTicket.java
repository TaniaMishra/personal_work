package mathOperators;

import java.util.Scanner;

public class SpeedingTicket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limit = 0;
		int speed = 0;
		int mphOver = 0;
		int fine = 0;
		
		System.out.println("What is the speed limit?");
		limit = input.nextInt();
		System.out.println("What is the speed of the driver?");
		speed = input.nextInt();
		
		mphOver = speed - limit;
		fine = 55 + 40*(mphOver-1);
		
		System.out.println("Speed Limit: " + limit);
		System.out.println("Drivers Speed: " + speed);
		System.out.println("Cost of the Ticket: $" + fine);
	}
}
