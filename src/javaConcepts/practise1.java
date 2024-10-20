package javaConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class practise1 {

	public void oddnumber(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	public void getmultiplybyeight(int a, int b) {
		int c = 0;
		for (int i = a; i <= b; i++) {
			if (i % 8 == 0) {
				i = i % 10;
				c = c + i;
				i = i / 10;
			}
			System.out.println(c);
		}

	}

	public void reverse(int num1) {
		int temp = 0;
		while (num1 > 0) {
			temp = temp * 10 + num1 % 10;
			num1 = num1 / 10;
		}
		System.out.println(temp);
	}

	public void pattern(int a) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void factorial(int b) {
		int fact = 1;
		int i = 1;
		while (i <= b) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

	public static int fibonacci(int num) {
		int a = 0, b = 1, c;
		if (num <= 0) {
			return num;
		}
		for (int i = 0; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void duplicateString(String str) {
		if(str ==null ) {
			System.out.println("Null string");
		}
		if(str.length()<=1 ||str.isBlank()) {
			System.out.println("Not Considered");
		}
		String caseWord = str.toLowerCase();
		char charWord[] = caseWord.toCharArray();
		Map<Character , Integer> mapWord = new HashMap<Character , Integer>();
		
		for(char word :charWord) {
			if(mapWord.containsKey(word)) {
				mapWord.put(word, mapWord.get(word)+1);
			}
			else {
				mapWord.put(word,1);
			}
		}
		Set<Map.Entry<Character , Integer>> setWord = mapWord.entrySet();
		for(Map.Entry<Character , Integer> dupWord : setWord) {
			if(dupWord.getValue()>1) {
				System.out.println(dupWord.getKey()+" repeat Word "+dupWord.getValue());
			}
		}
		
		}
	
	public static void emailValidation(String email) {
		Pattern pattern  = Pattern.compile("^[a-zA-Z0-9.!+_-]+@[a-zA-Z]+.[a-z]{2,3}$");
		java.util.regex.Matcher m = pattern.matcher(email);
		if(m.matches()) {
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * practise1 patternproblem = new practise1(); patternproblem.pattern(7);
		 * patternproblem.factorial(5); patternproblem.reverse(898832);
		 * patternproblem.oddnumber(5, 30); System.out.println(fibonacci(6));
		 * patternproblem.getmultiplybyeight(1, 80);
		 */
		/*
		 * duplicateString("A"); duplicateString(" "); duplicateString("Subasri");
		 * duplicateString("Environment"); duplicateString(null);
		 */
		emailValidation("qwerty21!!!@gmail.com");

	}

}
