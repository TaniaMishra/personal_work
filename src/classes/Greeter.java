package classes;

public class Greeter {
	private int age;
	
	public Greeter() {
		age = 14;
	}
	
	public Greeter(int a) {
		age = a;
	}
	
	public String sayHello() {
		return "Hello";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
}
