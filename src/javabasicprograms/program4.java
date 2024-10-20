package javabasicprograms;

import java.util.Scanner;

class bankinginfo{
	long accountNumber;
	String name;
	float amount;
	
	void customerDetails(long cusaccountNo,String cusName,float amt) {
		accountNumber=cusaccountNo;
		name=cusName;
		amount=amt;
		}
	void displayAllDetails() {
		System.out.println(accountNumber +" "+ name +" "+ amount);
	}
	void depositAmt(float amt ) {
		if(amt !=0) {
		amount=amount+amt;
		System.out.println("Deposit amount"+amount);
	}}
	void withdraw(float amt) {
		if(amount<=amt) {
			System.out.println("Insufficient Balance");
		}
		else if(amt!=0) {
			amount=amount-amt;
			System.out.println("Withdraw amount"+amount);
		}
	}
	void displayBalance() {
		System.out.println("Balance amount"+amount);
	}
	
} 

public class program4 {
	public static void main(String[] args) {
		
		banking b = new banking();
		b.customerDetails(877322900,"Skyla",50000);
		b.displayAllDetails();
		b.depositAmt(5000);
		b.displayBalance();
		b.withdraw(55000);
		b.displayBalance();
		
		
		
	}

}
