package javabasicprograms;

import org.testng.annotations.Test;

public class Factorial {

	@Test(enabled = false)
	public void factorial() {
		int num = 8, factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}

	@Test(enabled = false)

	public void digitCount() {
		int num = 1234;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

	@Test(enabled = false)
	public void armstrong() {
		int num1 = 371;
		int num2 = num1;
		int temp = 0;
		while (num1 > 0) {
			int a = num1 % 10;
			temp = temp + (a * a * a);
			num1 = num1 / 10;
		}
		System.out.println(temp);
		if (temp == num2) {
			System.out.println("ArmStrong");
		} else {
			System.out.println("Not armstrong");
		}

	}

	@Test(enabled = false)
	public void factorial1() {
		int number = 5;
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	@Test(enabled = false)
	public void neonnumber() {
		int number1 = 9;
		int sum = 0;
		int number2 = number1;
		int square = number1 * number1;
		while (square > 0) {
			int digit = square % 10;
			sum = sum + digit;
			square = square / 10;
		}
		System.out.println(sum);
		if (sum == number2) {
			System.out.println("neon");
		} else {
			System.out.println("Not neon");
		}
	}

	@Test(enabled = false)
	public void sumofdigits() {
		int a = 812;
		int b = 0;
		while (a > 0) {
			int c = a % 10;
			b = b + c;
			a = a / 10;
		}
		System.out.println(b);
	}

	@Test(enabled=false)
	public void stringCount() {
		String a="Progress Coverage Results";
		System.out.println(a.length());
		
	}
	
	
	
	@Test
	public void arm() {
		int a =9;
		int fact = 1;
		for(int i=1;i<=a;i++) {
			fact= fact*i;
		}
		System.out.println(fact);
		
	}
}
