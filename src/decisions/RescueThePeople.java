package decisions;
import java.util.Scanner;
public class RescueThePeople {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many people need to be saved?");
		int people = input.nextInt();
		
		int helicopters = people/10;
		int peopleLeft = people % 10;
		
		System.out.println("You will need " + helicopters + " helicopters.");
		
		if (peopleLeft == 0) {
			System.out.println("Mission was a success!");
		}
		else {
			System.out.println(peopleLeft + " people will die.");
		}
		input.close();
	}
}
