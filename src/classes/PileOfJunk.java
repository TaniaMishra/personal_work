package classes;

import java.util.Random;

public class PileOfJunk {
	Random rand = new Random();
	private static int idNum = 1;
	private int myId;
	private int randNum;
	
	public PileOfJunk() {
		int min = 10;
		int max = 100;
		randNum = min + rand.nextInt(max-min+1);
		myId = idNum;
		idNum++;
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
	
	public void setRandNum(int randNum) {
		this.randNum = randNum;
	}
}
