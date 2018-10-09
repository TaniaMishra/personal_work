package oop;

//import statements

public class Greeter {
	//instance fields - data storage
	private int age;
	
	//constructors - methods for constructing the object
	public Greeter() {
		// Statements to initialize the state of the object
		age = 14;
	}
	
	
	//methods - things the object can do
	public void sayHello() {
		System.out.println("Hello!");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
		System.out.println("Age: " + age);

	}
}
