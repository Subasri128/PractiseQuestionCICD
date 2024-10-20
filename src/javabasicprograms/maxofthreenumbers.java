package javabasicprograms;

import java.util.Scanner;

public class maxofthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,temp,large;
		Scanner sc = new Scanner(System.in);
		System.out.println("1st:");
		a=sc.nextInt();
		System.out.println("2nd:");
		b=sc.nextInt();
		System.out.println("3nd:");
		c=sc.nextInt();
		temp = a<b? b:a;
		large = temp>c ? temp:c;
		System.out.println("large"+ large);

	}

}
