package inheritance;

import java.util.Random;
import java.util.ArrayList;

public class TestGame {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 0; i < 10; i++) {
			int type = 1 + rand.nextInt(2);
			if (type == 1) {
				players.add(new Rogue(50, i+1, i+1, 0));
			}
			else {
				players.add(new Mage(50, i+1, i+1, 0));
			}
		}
		
		for (Player x : players) {
			if (x.dead() == false) {		//if they are alive
				if (x instanceof Rogue) {
					Rogue tempR = (Rogue)x;
					for (int i = 0; i < 14; i++) {
						tempR.move();
					}
				}
				else {
					Mage tempM = (Mage)x;
					for (int i = 0; i < 14; i++) {
						tempM.move();
					}
				}
			}
		}
		
		for (Player x : players) {
			System.out.println(x.stats());
		}
	}
}
