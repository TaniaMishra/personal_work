package decisions;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much money did you get for your fifth birthday?");
		double money = input.nextDouble();
		final double COMPARISON= Math.sqrt(84.3);
		
		if (Math.abs(money-COMPARISON) < 0.25) {	//if the difference between the two is less than .5, it is close (good)
			System.out.println("You won a good prize!!! :)");
		}
		else {
			System.out.println("You won a bad prize. :(");
		}
		
		input.close();
	}

}
