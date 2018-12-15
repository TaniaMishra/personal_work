package classes;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Integer> fileSizes;
	private final int cap;
	private int spaceLeft;
	
	/*
	@ xSpace has to be less than the cap & greater than 0
	@ xSpace has to equal the cap when added to the size of fileSizes
	@ xSizes has to be less than or equal to cap
	*/
	public HardDrive(String xName, ArrayList<Integer> xSizes, int xCap, int xSpace) {
		name = xName;
		cap = xCap;
		if (fileSizes.size() <= cap) {
			fileSizes = xSizes;
		}
		if (xSpace + fileSizes.size() == cap && xSpace > 0 && xSpace < cap) {
			spaceLeft = xSpace;
		}
		else {
			spaceLeft = cap - fileSizes.size();
		}
	}
	
	public void addFile(int size) {
		fileSizes.add(size);
	}
	
	public void deleteFile(int index) {
		fileSizes.remove(index);
	}
	
	public boolean isFull() {
		if (cap == fileSizes.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if (spaceLeft == fileSizes.size()) {
			return true;
		}
		else {
			return false;
		}
	}
}
