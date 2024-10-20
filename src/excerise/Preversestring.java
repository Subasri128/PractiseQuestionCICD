package excerise;

import java.util.Scanner;

public class Preversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String sentence = sc.next();
		String reversesentence = "";
		for(int i=sentence.length()-1;i>=0;i--) {
			reversesentence=reversesentence+sentence.charAt(i);
		}
		System.out.println(reversesentence);
		if(sentence.equals(reversesentence)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.print("NON Palindrome");
		}

	}

}
