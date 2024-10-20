package javabasicprograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int reverse =0;
			int temp =a;
			while(temp>0) {
				reverse=reverse*10+temp%10;
				temp=temp/10;
			}
			System.out.println(reverse);
			if(a==reverse) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not Palindrome");
			}
	

	}

}
