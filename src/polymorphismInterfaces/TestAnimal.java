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
		
		for (int i = 0; i < pets.size(); i++) {
			if (pets.get(i) instanceof Dog) {
				Dog doggy = (Dog)pets.get(i);
				doggy.vet();
			}
		}
		
		for (int i = pets.size()- 1; i >= 0; i--) {
			if (pets.get(i) instanceof Cat) {
				Cat kitty = (Cat)pets.get(i);
				if (kitty.returnFriendly() == false) {
					pets.remove(i);
					break;
				}
			}
		}
		
		System.out.println("");
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i).toString());
		}
	}
}
