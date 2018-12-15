package classes;

import java.util.ArrayList;

public class TestHardDrive {
	public static void main(String[] args) {
		ArrayList<Integer> fileSizes = new ArrayList<Integer>();
		HardDrive hp = new HardDrive("Harry Potter", fileSizes, 7, 7);
		
		System.out.println("Is empty? " + hp.isEmpty());
		hp.addFile(1);
		hp.addFile(2);
		hp.addFile(3);
		System.out.println("Is empty? " + hp.isEmpty());
		hp.addFile(4);
		hp.addFile(5);
		hp.addFile(6);
		System.out.println("Is full? " + hp.isFull());
		hp.addFile(7);
		System.out.println("Is full? " + hp.isFull());
		hp.deleteFile(2);
		System.out.println("Is full? " + hp.isFull());

		

	}
}
