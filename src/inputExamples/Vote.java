package inputExamples;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean vote = false;
		System.out.println("Did you vote? (Answer with true or false)");
		vote = input.nextBoolean();
		System.out.println("Voted: " + vote);
	}

}
