package javabasicprograms;

class banking{
	long accountNumber;
	String name;
	float amount;
	
	void customerDetails(long cusaccountNo,String cusName,float amt) {
		accountNumber=cusaccountNo;
		name=cusName;
		amount=amt;
		}
	void displayAllDetails() {
		System.out.println(accountNumber+""+name+""+amount);
	}
	void depositAmt(float amt ) {
		amount=amount+amt;
		System.out.println("Deposit amount"+amount);
	}
	void withdraw(float amt) {
		if(amount<=amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount=amount-amt;
			System.out.println("Withdraw amount"+amount);
		}
	}
	void displayBalance() {
		System.out.println("Balance amount"+amount);
	}
	
} 

public class Bankingpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banking b = new banking();
		b.customerDetails(877322900,"Skyla",50000);
		b.displayAllDetails();
		b.depositAmt(5000);
		b.displayBalance();
		b.withdraw(55000);
		b.displayBalance();
		
}

}
