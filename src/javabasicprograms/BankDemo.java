package javabasicprograms;

public class BankDemo {
	public long accountNumber;
	public String name;
	public double balance;
	
	public BankDemo(long accountNumber,String name,double balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance= balance>0 ? balance : 0;
		System.out.println(this.accountNumber+ " "+this.name+" "+this.balance );
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void depositeAmount(double amount) {
		try {
			this.balance+=amount; 
			System.out.println(this.accountNumber+ " "+this.name+" "+this.balance );
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void withdrawAmount(double amount) {
		try {
			if(amount<=this.balance && amount>0 ) {
				this.balance-=amount;
				System.out.println(this.accountNumber+ " "+this.name+" "+this.balance );
			}else {
				System.out.println("Insufficient Balance ,Please enter the valid amount!!");
			}
			 
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void getDetails() {
		System.out.println(this.accountNumber+ " "+this.name+" "+this.balance );
	}
	
	
	public static void main(String[] args) {
		
		BankDemo bankDemo=new BankDemo(10009878,"Subasri", 10000);
		//bankDemo.getDetails();
		bankDemo.depositeAmount(5050);
		//bankDemo.getDetails();
		bankDemo.withdrawAmount(20000);
		//bankDemo.getDetails();
		bankDemo.withdrawAmount(2000);
		//bankDemo.getDetails();
		bankDemo.depositeAmount(-50);
//		bankDemo.getDetails();
//		bankDemo.depositeAmount("asd");
//		bankDemo.getDetails();

	}

}
