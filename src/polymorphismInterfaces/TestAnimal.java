package polymorphismInterfaces;

import java.util.ArrayList;

public class TestAnimal {
	public static void main(String[] args) {
		ArrayList<Animal> pets = new ArrayList<Animal>();
		pets.add(new Dog("Dog1", 1, false));
		pets.add(new Dog("Dog2", 2, true));
		pets.add(new Cat("Cat1", 1, true));
		pets.add(new Cat("Cat2", 2, false));

		for (int i = 0; i < pets.size(); i++) {
			pets.get(i).act();
			System.out.println(pets.get(i).toString());
		}
		
		Dog dog1 = (Dog)pets.get(0);
		Dog dog2 = (Dog)pets.get(1);
		dog1.vet();
		dog2.vet();
		
		Cat cat2 = (Cat)pets.get(3);
		if (cat2.returnFriendly() == false) {
			pets.remove(3);
		}
		else {
			Cat cat1 = (Cat)pets.get(2);
			if (cat1.returnFriendly() == false) {
				pets.remove(2);
			}
		}
		
		System.out.println("");
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i).toString());
		}
	}
}
