package classes;

public class TestStudent {
	public static void main(String[] args) {
		Student bob = new Student();
		bob.addScore("90");
		bob.addScore("92");
		bob.addScore("94");
		bob.addScore("96");
		bob.addScore("98");
		bob.addScore("100");
		System.out.println("Lowest Score: " + bob.lowestScore());
		System.out.println("Average: " + bob.averageScores());
		System.out.println("Reference: " + bob.studentToString());
		Student jim = bob.cloneStudent();
		System.out.println("Bob has the same scores as Jim? " + bob.equals(jim));
	}
}
