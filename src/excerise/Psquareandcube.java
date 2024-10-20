package excerise;

import java.util.Scanner;

public class Psquareandcube {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number");
	int n =sc.nextInt();

		
	}
	/**public static void results(int number) {
		System.out.println("Square"+Math.pow(number, 2));
		System.out.println("cube"+Math.pow(number, 3));
		System.out.println("Squareroot"+Math.sqrt(number));
	}
	**/
	public static boolean armString(int number1) {
		int digit =0,a=number1,b,c=0;
		while(number1>0) {
			int i=number1/10;
			digit++;
		}
		System.out.println(digit);
		while(number1>0) {
			b=number1%10;
			c=(int) (c+Math.pow(b, digit));
			number1=number1/10;
		}
		System.out.println(c);
		if(c==a) {
			System.out.println("arm");
		}
		else {
			System.out.println("Notarm");
		}
		return false;
		
	}

}
