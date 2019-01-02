package classes;

public class Student {
	private String name;
	private int[] tests;
	private int howMany;
	
	public Student() {
		name = "Bob Smith";
		tests = new int[5];
		howMany = 0;
	}
	
	public Student(String n, int[] t) {
		name = n;
		tests = t;
		howMany = 0;
		for (int i = 0; i < tests.length; i++) {
			if (tests[i] != 0) {
				howMany++;
			}
		}
	}
	
	public void addScore(String score) {
		int intScore = Integer.parseInt(score);
		tests[howMany] = intScore;
		howMany++;
	}
	
	public double averageScores() {
		double average = 0;
		for (int i = 0; i < howMany; i++) {
			average += tests[i];
		}
		average = average/howMany;
		return average;
	}
	
	public int lowestScore() {
		int lowest = 10000000;
		for (int i = 0; i < howMany; i++) {
			if (tests[i] < lowest) {
				lowest = tests[i];
			}
		}
		return lowest;
	}
	
	public String toString() {
		return ("Student: name - " + name + ", tests - " + tests[0] + ", " + tests[1] + ", " + tests[2] + ", " + tests[3] + ", " + tests[4] + ", howMany - " + howMany);
	}
	
	public Student clone() {
		return new Student(name, tests);
	}
	
	public boolean equals(Student user) {
		return (this.toString().equals(user.toString()));
	}
}
