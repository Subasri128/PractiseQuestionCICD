package javabasicprograms;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "Welcome to Universe";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		String [] split = str.split(" ");
		for(String a :split ) {
			int n = a.length();
			String reverse="";
			char ch;
			for(int i=0;i<n;i++) {
				ch=a.charAt(i);
				reverse =ch+reverse;
				
			}
			System.out.print(reverse);
		}
	}

}
