package polymorphismInterfaces;

import java.util.ArrayList;

public class TestFish {
	public static void main(String[] args) {
		ArrayList<Fish> fishies = new ArrayList<Fish>();
		fishies.add(new Trout(10, 1, 50));
		fishies.add(new Trout(9, 2, 60));
		fishies.add(new Trout(8, 3, 70));
		fishies.add(new Trout(7, 4, 80));
		fishies.add(new Goldfish(10, 3, "blue"));
		fishies.add(new Goldfish(8, 4, "yellow"));
		fishies.add(new Goldfish(6, 5, "purple"));

		double longest = 0;
		int longIndex = 0;
		for (int i = 0; i < fishies.size(); i++) {
			if (fishies.get(i).getLength() > longest) {
				longest = fishies.get(i).getLength();
				longIndex = i;
			}
		}

		System.out.println("Longest fish: " + fishies.get(longIndex).toString());
		
		double longestLength = 0;
		int goldIndex = 0;
		int oldest = 0;
		int troutIndex = 0;
		for (int i = 0; i < fishies.size(); i++) {
			if (fishies.get(i) instanceof Goldfish) {
				Goldfish goldy = (Goldfish)fishies.get(i);
				if (goldy.getLength() > longestLength) {
					longestLength = goldy.getLength();
					goldIndex = i;
				}
			}
			else if (fishies.get(i) instanceof Trout) {
				Trout trouty = (Trout)fishies.get(i);
				if (trouty.getAge() > oldest) {
					oldest = trouty.getAge();
					troutIndex = i;
				}
			}
		}
		
		Goldfish goldy = (Goldfish)fishies.get(goldIndex);
		System.out.println("Color of the longest goldfish: " + goldy.getColor());
		Trout trouty = (Trout)fishies.get(troutIndex);
		System.out.println("Number of scales on the oldest trout: " + trouty.getNumScales());
		
	}
}
