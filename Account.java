package zadaci;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return ((annualInterestRate / 100.0) / 12) * balance;
	}
	
	public void withdraw(double withdrawAmmount) {
		balance -= withdrawAmmount;
	}
	
	public void deposit(double depositAmmount) {
		balance += depositAmmount;
	}

	public static void main(String[] args) {

		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println("Balance: " + ac.getBalance());
		System.out.println("Monthly interest: " + ac.getMonthlyInterest());
		System.out.println("The date account was created: " + ac.getDateCreated());
	}

}
