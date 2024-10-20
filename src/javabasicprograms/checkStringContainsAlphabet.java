package javabasicprograms;

import java.util.Scanner;

public class checkStringContainsAlphabet {

	public static boolean isVowel(String str) {
		return ((str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isLetter)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;

		Scanner sc = new Scanner(System.in);
		System.out.println("1st:");
		str = sc.next();
		System.out.println("output:" + isVowel(str));
	}}
