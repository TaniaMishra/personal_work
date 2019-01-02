package classes;

public class TestStudent {
	public static void main(String[] args) {
		Student bob = new Student();
		bob.addScore("90");
		bob.addScore("92");
		bob.addScore("94");
		bob.addScore("96");
		bob.addScore("98");
		System.out.println("Lowest Score: " + bob.lowestScore());
		System.out.println("Average: " + bob.averageScores());
		System.out.println("State: " + bob.toString());
		Student jim = bob.clone();
		System.out.println("Bob has the same scores as Jim? " + bob.equals(jim));
	}
}
