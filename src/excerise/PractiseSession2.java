package excerise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PractiseSession2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ValidateArmStrong(317);
//		ValidateArmStrong(764);
//		
//		ValidateReverseNumber(32);
//		ValidateReverseNumber(7);
//		ValidateReverseNumber(98765);
//		ValidateReverseNumber(9011);
//		
//		emailValidate("asdtr#4@hiks.c");
//		emailValidate("asd$4@hiks.com");
//		emailValidate("#gogle4@hiks.in");
//		emailValidate("faodail.2344@hiks.com");
		
//		ValidateVowel("rfdgt");
//		ValidateVowel("west");
//		ValidateVowel("plkmn");
//		ValidateVowel("goat");
//		
//		reverseWord("racecar");
//		reverseWord("Sauce");
//		reverseWord("session");
//		reverseWord("programs");
		
		
//		validatePrime(3);
//		validatePrime(-5);
//		validatePrime(39);

		int i=8;
		for(int n=0;n<i;n++) {
			System.out.println(fibonacci(n));
		}
		
		
		
		
		
		
		

	}
	public static int fibonacci(int n){
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	
	public static void validatePrime(int n) {
		if(n<=1) {
			System.out.println("Enter another number");
		}
		
			if(n%2==0) {
				System.out.println("not prime");
				
			}
			else {
				System.out.println("Prime");
			}
			
		
	}
	  
	
	public static void ValidateArmStrong(int number) {
		int num = number;
		int temp =0;
		while(number>1) {
			int a = number%10;
			temp = temp+(a*a*a);
			number = number/10;
		}
		System.out.println(temp);
		if(num==temp) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}
	
	public static void ValidateReverseNumber(int number) {
		int temp =0;
		while(number>1) {
			int a= number%10;
			temp = temp*10+a;
			number = number/10;
		}
		System.out.println(temp);
	}
	
	public static void emailValidate(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9_.+#&]+@[a-z0-9]+.[a-z]{2,3}$");
		java.util.regex.Matcher m = p.matcher(email);
		if(m.matches()) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}
	}

	public static  void ValidateVowel(String text) {
		String lower = text.toLowerCase();
		Pattern p = Pattern.compile("[aeiouAEIOU]");
		Matcher m = p.matcher(lower);
		if(m.find()) {
			System.out.println("contains Vowel");
		}
		else {
			System.out.println("no Vowel");
		}
		
			}
	
	public static void reverseWord(String word) {
		String copy = word;
		String rev = "";
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		if(copy.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
