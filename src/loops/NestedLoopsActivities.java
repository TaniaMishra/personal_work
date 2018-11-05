package loops;

public class NestedLoopsActivities {
	public static void main(String[] args) {
		//#1
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print((i * j) + "   ");
			}
			System.out.println("");
		}
		
		//#2
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				if (j == 3) {
					System.out.print(i + "  ");
				}
				else {
					System.out.print(j + "  ");
				}
			}
			System.out.println("");
		}

		//#3
		int divisors = 0;	//number of divisors in a number (j)
		int mostDivisors = 0;	//most number of divisors in a number(j)
		int number = 0;	//number with most divisors
		for (int j = 1; j <= 1000; j++) {
			for (int i = 1; i <= j; i++) {
				int tester = j % i;
				if (tester == 0) {
					divisors++;
				}
			}
			if (divisors > mostDivisors) {	//if num. of divisors in j is greater than the num. of divisors in previous j values, set num. w/most divisors = to j
				number = j;
				mostDivisors = divisors;
			}
			divisors = 0;
		}
		
		System.out.println("The number with the most divisors: " + number + " with " + mostDivisors + " divisors.");
	}
}
