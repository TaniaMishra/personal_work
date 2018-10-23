package loops;

import java.util.Scanner;

public class ClassActivities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//#1 - count from 0-100 using a while loop
		int count = 0;							//1. get
		while (count <= 100) {					//2. test
			System.out.print(count + ", ");		//3. use
			count ++;							//1. get
		}
		
		//#2 - possible multiples of 2 from 1-100,000 using a while loop
		count = 2;
		while(count <= 10) {
			System.out.println(count);
			count += 2;
		}
		
		//#3 - possible multiples of 2 from 0-user input number
		count = 0;
		System.out.println("How far do you want to count to?");
		int end = input.nextInt();
		
		while (count <= end) {
			System.out.println(count);
			count += 2;
		}
		
		//#4 - display the sum of the multiples of two from 0-user input number
		count = 0;
		System.out.println("How far do you want to count to?");
		end = input.nextInt();
		int numSum = 0;
		while (count <= end) {
			numSum += count;
			count += 2;
		}
		System.out.println(numSum);

		//#5 - prompt user for ints, display two times the values entered until the user enters 9999
		System.out.print("Please enter a number. (9999 to quit): ");
		int userNum = input.nextInt();
		while (userNum != 9999) {
			System.out.println("Your number times two is: " + (userNum*2));
			System.out.print("Please enter a number. (9999 to quit): ");
			userNum = input.nextInt();
		}

		//#6 - prompt user for doubles until they quit, display sum
		System.out.print("Please enter a number. (9999 to quit): ");
		double num = input.nextDouble();
		double sum = 0;
		while(num != 9999) {
			sum += num;
			System.out.print("Please enter a number. (9999 to quit): ");
			num = input.nextDouble();
		}
		System.out.println("The sum of the numbers entered is: " + sum);

		//#8 - prompt user for doubles, when they are done, display average
		System.out.print("Please enter a number. (9999 to quit): ");
		num = input.nextDouble();
		double ave = 0;
		count = 0;
		while(num != 9999) {
			ave += num;
			count ++;
			System.out.print("Please enter a number. (9999 to quit): ");
			num = input.nextDouble();
		}
		ave = ave/count;
		System.out.println("The average of the numbers entered is: " + ave);
		
		//#9 - prompt user for doubles, when done, display largest value entered
		System.out.print("Please enter a number. (9999 to quit): ");
		num = input.nextDouble();
		double big = 0;
		while(num != 9999) {
			if (num > big) {
				big = num;
			}
			System.out.print("Please enter a number. (9999 to quit): ");
			num = input.nextDouble();
		}
		System.out.println("The biggest of the numbers entered is: " + big);
		
		input.close();
	}

}
