package classes;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Integer> fileSizes;
	private int cap;
	private int space;
	
	public HardDrive(String xName, ArrayList<Integer> xSizes, int xCap, int xSpace) {
		name = xName;
		fileSizes = xSizes;
		cap = xCap;
		space = xSpace;
	}
	
	public void addFile(int size) {
		fileSizes.add(size);
	}
	
}
