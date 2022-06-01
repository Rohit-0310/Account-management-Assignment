package com.masai.opp;

public class Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= 0) {
			this.balance = balance;			
		}
	}
	
	public void credit(int howMuch) {
		if(howMuch > 0) {
			this.balance = this.balance + howMuch;
		}
	}
	
	
	public void debit(int howMuch) {
		if(this.balance < howMuch) {
			System.out.println("The debit amount Should be less than the main balance.");
			return;
		}
		else if(howMuch <= 0) {
			System.out.println("The debit amount Should be greater than 0.");
		}
		else if(this.balance > howMuch && howMuch > 0) {
			this.balance = this.balance - howMuch;
		}
	}
	
	
	
	
	
}
