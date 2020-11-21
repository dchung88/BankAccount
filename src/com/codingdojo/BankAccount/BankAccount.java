package com.codingdojo.BankAccount;
import java.util.*;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	private static int numberOfAccounts = 0;
	private static Double totalAccountBalances = 0.0;
	
	private String makeAccountNumber() {
		Random an = new Random();
		String acctNumber = "";
		
		for(int i = 0; i < 10; i++) {
			acctNumber += an.nextInt(9);
		}
		accountNumber = acctNumber;
		
		System.out.println(accountNumber);
		return accountNumber;
	}
	public BankAccount() {
		makeAccountNumber();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		
		numberOfAccounts++;
		System.out.println(numberOfAccounts);	
		
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public Double depositMoney(String account, Double amount) {
		if(account.equals("Checkings")) {
			Double checkingDeposit = getCheckingBalance() + amount;
			setCheckingBalance(checkingDeposit);
			totalAccountBalances += amount;
		}
		else if(account.equals("Savings")) {
			Double savingsDeposit = getSavingsBalance() + amount;
			setSavingsBalance(savingsDeposit);
			totalAccountBalances += amount;
		}
		else {
			System.out.println("You must pick Checkings or Savings to deposit");
		}

		return totalAccountBalances;
	}
	public void withdrawMoney(String account, Double amount) {
		
		if(account.equals("Checkings") && amount > this.checkingBalance) {
			System.out.println("Insufficient funds for this withdrawal");
		}
		else if(account.equals("Checkings") && amount < this.checkingBalance) {
			Double checkingWithdrawal = getCheckingBalance() - amount;
			setCheckingBalance(checkingWithdrawal);
			totalAccountBalances -= amount;
		}
		else if(account.equals("Savings") && amount > this.savingsBalance) {
			System.out.println("Insufficient funds for this withdrawal");
		}
		else if(account.equals("Savings") && amount < this.savingsBalance) {
			Double savingsWithdrawal = getSavingsBalance() - amount;
			setSavingsBalance(savingsWithdrawal);
			totalAccountBalances -= amount;
		}
		
	}
	public void totalBalances() {
		System.out.println("Checking Account Balance: " + getCheckingBalance());
		System.out.println("Savings Account Balance: " + getSavingsBalance());
		System.out.println("Total Account Balances: " + totalAccountBalances);
	}
	
}
