package javabasicprograms;

import org.testng.annotations.Test;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "racecar is manufactured";
		String reverseword = "";
	
		for(int i = word.length()-1;i>=0;i--) {
			reverseword=reverseword+word.charAt(i);
		}
		System.out.println(reverseword);
		if(word.equals(reverseword)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
