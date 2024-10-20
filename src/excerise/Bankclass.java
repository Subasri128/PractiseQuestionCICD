package excerise;

import java.util.Scanner;

public class Bankclass {
	
	public static  String accountName;
	public static  long accountNumber;
	public static  double balanceAmount;

	public Bankclass(String accountName, long accountNumber ,double balanceAmount) {
		this.accountName = accountName;
		this.accountNumber=		accountNumber ;
		this.balanceAmount=balanceAmount >0 ?balanceAmount:0;
	}
	
	
	public Bankclass(String accountName2, String accountName3, double balanceAmount2) {
		// TODO Auto-generated constructor stub
	}


	public void show()  
	{  
	System.out.println("Name : "+this.accountName);  
	System.out.println("Accountnumber : "+this.accountNumber);  
	System.out.println("balance: "+this.balanceAmount);  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter name");
	       accountName = sc.next();
	       System.out.println("Enter account number :");
	       accountNumber = sc.nextLong();
	       System.out.println("Enter balance:");
	       balanceAmount = sc.nextDouble();
	       

	       Bankclass c= new Bankclass(accountName, accountName, balanceAmount);
	       new Bankclass(accountName, accountName, balanceAmount).show();
	       }

	}


