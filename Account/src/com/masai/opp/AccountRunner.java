package com.masai.opp;

public class AccountRunner {
	public static void main(String[] args) {
		Account amount = new Account();
		
		
		amount.setBalance(0);
		
		
		System.out.println("Initlal Amount =>"+ amount.getBalance());
		amount.credit(500);
		System.out.println("Amount after Cradit =>"+ amount.getBalance());
		amount.debit(70);
		
		
		System.out.println("Amount after debit =>"+ amount.getBalance());
		
	}

}
