package polymorphismInterfaces;

public class Student implements Person {
	String name;

	int studentAge;

	String bestFriend;

	int absent;

	double gpa;

	public Student() {
		name = "Sam Jones";
		studentAge = 15;
		bestFriend = "Bob Smith";
		absent = 0;
		gpa = 0.0;
	}

	public void setName(String xName) {
		name = xName;
	}

	public int getAge() {
		return studentAge;
	}

	public String getName() {

		return name;
	}

	public int getAbsent() {
		return absent;
	}

	public void outSick() {
		absent++;
	}

	public String toString() {
		return "Student: " + name + " " + studentAge + " " + bestFriend + " " + absent + " " + gpa;

	}
}
