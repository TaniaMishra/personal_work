package inputExamples;

import java.util.Scanner;

public class BonesBroken {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num_bones = 0;
		System.out.println("How many bones have you broken? (Enter the number)");
		num_bones = userInput.nextInt();
		System.out.println("You have broken " + num_bones + " bones.");
	}
}
