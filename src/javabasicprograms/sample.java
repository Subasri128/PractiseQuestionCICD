package javabasicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class sample {
	
	@Test(priority=2)
	public void emailValidation()
	{
		String email ="coverage55@gmail.com";
		String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher =pattern.matcher(email);
		boolean isEmailValid =matcher.matches();
		if(isEmailValid) {
			System.out.println("EMAIL VALID");
		}
		else {
			System.out.println("NOT VALID EMAIL");
		}
		}
	
	@Test(priority=6)
	public void splitFromEmail() {
		String email = "coverage55@gmail.com";
		String regex ="@";
		String arr[]=email.split(regex);
		System.out.println("A: "+arr[0]);
				}
	@Test(priority=1)
	public int numberPalindrome() {
		int a =76779076;
		int reverse =0;
		while(a!=0) {
			reverse=reverse*10+a%10;
			a=a/10;
		}
		return reverse;
	}


}
