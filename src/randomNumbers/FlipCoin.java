package randomNumbers;

import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		Random rand = new Random();
		int max = 2;
		int min = 1;
		double maxHeads = 0;
		double minHeads = 100;
		double percentage = 0;
		int heads = 0;		//1 = heads, 2 = tails
		
		for (int i = 0; i < 1000000; i++) {
			for (int j = 0; j < 100000; j++) {
				int outcome = min + rand.nextInt(max - min + 1);
				if (outcome == 1) {
					heads++;
				}
			}
			percentage = (heads/100000) * 100;
			if (percentage > maxHeads) {
				maxHeads = percentage;
			}
			else if (percentage < minHeads) {
				minHeads = percentage;
			}
			
			heads = 0;		//reset
		}
		
		System.out.println("Max percentage of heads flipped: " + maxHeads);
		System.out.println("Min percentage of heads flipped: " + minHeads);

	}
}
