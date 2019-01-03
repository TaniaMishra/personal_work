package polymorphismInterfaces;

public class Teacher {
	String name;
	int teacherAge;
	boolean gender; // true = male
	double bankBalance;
	double payCheck;

	public Teacher() {
		name = "Emily Lewis";
		teacherAge = 25;
		gender = false;
		bankBalance = 10000;
		payCheck = 200;
	}

	public void setName(String xName) {
		name = xName;
	}

	public int getAge() {
		return teacherAge;
	}

	public String getName() {

		if (name.indexOf(" ") < 0)
			name = " " + name;
		if (gender)
			return ("Mr. " + name.substring(name.indexOf(" ")));
		else
			return ("Mrs. " + name.substring(name.indexOf(" ")));

	}

	public double getBalance() {
		return bankBalance;
	}

	public void payMe() {
		bankBalance += payCheck;
	}

	public String toString()
	{
		return "Teacher" +name+teacherAge+gender+bankBalance+payCheck;
	}
}
