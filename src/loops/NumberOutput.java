package loops;

public class NumberOutput {

	public static void main(String[] args) {
		int row = 1;
		while(row <= 5) {
			for (int i = row; i <= 5; i++) {
				System.out.print(i + "  ");
			}
			System.out.print(row);
			System.out.println("");
			row++;
		}

	}

}
