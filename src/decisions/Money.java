package decisions;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("What is your current GPA?");
		double gpa = input.nextDouble();
		
		double money = 0;
		
		if ((age+gpa) > 20) {
			money += 250;
		}
		else {
			money += 30;
		}
		
		System.out.println("You will recieve $" + money);
		
		input.close();
	}

}
