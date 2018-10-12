package oop;

import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount savings = new BankAccount();
		BankAccount checking = new BankAccount();
		
		System.out.println("What is the balance of your savings account?");
		savings.setBalance(input.nextDouble());
		System.out.println("What is the account number of your savings account?");
		savings.setAccountNum(input.nextInt());
		System.out.println("What is the interest rate for your savings account?");
		savings.setIntRate(input.nextDouble());
		
		
		System.out.println("What is the balance of your checking account?");
		checking.setBalance(input.nextDouble());
		System.out.println("What is the account number of your checking account?");
		checking.setAccountNum(input.nextInt());
		System.out.println("What is the interest rate for your checking account?");
		checking.setIntRate(input.nextDouble());
		System.out.println("What is the finance charge for your checking account?");
		double charge = input.nextDouble();
		
		savings.deposit(100.0);
		checking.setIntRate(0.18);
		checking.withdraw(1000.0);
		savings.addInterest();
		checking.financeCharge(charge);
		
		System.out.println("Savings Account:");
		System.out.println("Account Number: " + savings.getAccountNum());
		System.out.println("Balance: " + savings.getBalance());
		System.out.println("Interest Rate: " + savings.getIntRate());
		
		System.out.println("\nChecking Account:");
		System.out.println("Account Number: " + checking.getAccountNum());
		System.out.println("Balance: " + checking.getBalance());
		System.out.println("Interest Rate: " + checking.getIntRate());
		
		
		input.close();
	}
}
