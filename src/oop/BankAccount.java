package oop;

public class BankAccount {
	private double balance;
	private int accountNum;
	private double intRate;
	
	public BankAccount() {
		balance = -99.9;
		accountNum = 999999;
		intRate = 0.99;
	}
	public BankAccount(double newBalance, int newAccountNum, double newIntRate) {
		balance = newBalance;
		accountNum = newAccountNum;
		intRate = newIntRate;
	}
	
	public double getBalance() {
		return balance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public double getIntRate() {
		return intRate;
	}
	
	public void setBalance(double newBal) {
		balance = newBal;
	}
	public void setAccountNum(int newNum) {
		accountNum = newNum;
	}
	public void setIntRate(double newRate) {
		intRate = newRate;
	}
	
	
	public void deposit(double dep) {
		balance += dep;
	}
	public void withdraw(double draw) {
		balance -= draw;
	}
	public void addInterest() {
		double interest = intRate * balance;
		balance = balance + interest;
	}
	public void financeCharge(double charge) {
		balance -= charge;
	}
}
