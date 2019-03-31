package comparableInterfaces;

import java.util.ArrayList;

public class TestCat {
	public static void main(String[] args) {
		CatStart[] cats = new CatStart[100];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new CatStart(i+1, i+10);
		}
		
		int smallest = 0;
		int largest = 0;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i].compareTo(cats[smallest]) == -1) {
				smallest = i;
			}
			else if (cats[i].compareTo(cats[largest]) == 1) {
				largest = i;
			}
		}
		
		System.out.println("Smallest age of cats: " + cats[smallest].toString());
		System.out.println("Largest age of cats: " + cats[largest].toString());

	}
}
