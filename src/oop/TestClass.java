package oop;

public class TestClass {

	public static void main(String[] args) {
		Greeter bob = new Greeter();
		Friend john = new Friend();
		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		Dog joe = new Dog();
		
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		john.sayMessage();
		bob.sayHello();
		billy.sayMessage();
		kyle.sayMessage();
		joe.woof();
		joe.attack();
		
	}

}
