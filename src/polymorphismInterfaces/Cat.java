package polymorphismInterfaces;

public class Cat implements Animal{
	private String name;
	private int age;
	private boolean friendly;
	
	public Cat(String n, int a, boolean f) {
		name = n;
		age = a;
		friendly = f;
	}
	
	public void act() {
		age += 9;
		if (friendly == true) {
			friendly = false;
		}
		else {
			friendly = true;
		}
	}
	
	public String toString() {
		return ("Cat: name - " + name + ", age - " + age + ", friendly - " + friendly);
	}
	
	public boolean returnFriendly() {
		return friendly;
	}
}
