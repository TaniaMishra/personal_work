package loops;

public class PerfectNumbers {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			for (int i = 1; i < j; i++) {
				int tester = j % i;
				if (tester == 0) {
					sum += i;
					//System.out.println("i" + i);
				}
			}
			//System.out.println("sum" + sum);
			if (sum == j) {
				System.out.println("Perfect Number: " + j);
			}
		}
		
	}
}
