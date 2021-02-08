package accessModifiers;

import java.util.ArrayList;

public class Account {
	public String name;
	public int balance = 0;
	public ArrayList<Integer> transactions;
	
	Account(String name) {
		this.name = name;
		this.transactions = new ArrayList<>();
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			this.transactions.add(amount);
			this.balance += amount;
			System.out.println(amount + " deposited. Balance is now " + this.balance);
		} else {
			System.out.println("cannot deposit negative sums");
		}
	}
	
	public void withdraw(int amount) {
		int withdrawal = -amount;
		if(withdrawal < 0) {
			this.transactions.add(withdrawal);
			this.balance += withdrawal;
			System.out.println(amount + "withdrawn. Balance is now " + this.balance);
		} else {
			System.out.println("cannot withdraw negative sums");
		}
	}
	
}
