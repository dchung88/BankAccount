package com.codingdojo.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		
		a.depositMoney("Checkings", 6.00);
		a.depositMoney("Checkings", 1.00);
		a.depositMoney("Savings", 5.00);
		a.withdrawMoney("Checkings", 4.00);
		a.withdrawMoney("Savings", 4.00);
		a.totalBalances();
		
		b.depositMoney("Checkings", 62.10);
		b.depositMoney("Savings", 50.21);
		b.withdrawMoney("Checkings", 63.00);
		
		b.withdrawMoney("Savings", 70.00);
		b.totalBalances();

	}

}
