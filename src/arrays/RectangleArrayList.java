package arrays;

import java.util.Random;
import java.util.ArrayList;

public class RectangleArrayList {
	public static void main(String[] args) {
		Random rand = new Random(5);
		
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		
		int min = 1;
		int max = 50;
		
		for (int i = 0; i < 20; i++) {
			int length = min + rand.nextInt(max-min+1);
			int width = min + rand.nextInt(max-min+1);
			recs.add(new Rectangle(length, width));
		}
		
		int biggestArea = min*min;
		int biggestIndex = 0;
		int smallestArea = max*max;
		int smallestIndex = 0;
		
		for (int i = 0; i < recs.size(); i++) {
			int area = recs.get(i).area();
			if (area > biggestArea) {
				biggestArea = area;
				biggestIndex = i;
			}
			if (area < smallestArea) {
				smallestArea = area;
				smallestIndex = i;
			}
		}
		
		recs.add(0, recs.get(biggestIndex));
		recs.remove(biggestIndex+1);
		recs.set(recs.size()-1, recs.get(smallestIndex));
		recs.remove(smallestIndex);
		
		//System.out.println("Big = " + biggestIndex);
		//System.out.println("Small = " + smallestIndex);
		
		for (int i = 0; i < recs.size(); i++) {
			System.out.println(recs.get(i).area());
		}
		
		
	}
}
