package excerise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practiseSession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		armStrongNumber(371);
//		armStrongNumber(238);
//
//		mailChecker("acv*21@gmail.com");
//		mailChecker("aASDv*21@gmail.com");
//		mailChecker("acv*21@gmail.codtym");
//
//		subStringTotal("sew");
//		subStringTotal("total");
//
//		palidromeString("Mango");
//		palidromeString("racecar");
//		palidromeString("Malayalam");
//
//		reverseNumber(5467);
//		reverseNumber(9000);
//		reverseNumber(1221);
//		reverseNumber(434);
//
//		repetedCharacterCount("subasri");
//		repetedCharacterCount("encyclopediaaa");
		
		duplicateCharacterCount("Progreaaasss");
		duplicateCharacterCount("gingerbread");
		duplicateCharacterCount("universe");
		

	}
	
	public static void duplicateCharacterCount(String word) {
		if(word==null) {
			System.out.println("Null String");
			return;
		}
		if(word.isEmpty() || word.contains(" ")) {
			System.out.println("Empty String");
			return;
		}
		if(word.length()<=1) {
			System.out.println("Single Character");
		}
		char[] ch =word.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character chWord : ch) {
			if(charMap.containsKey(chWord)) {
				charMap.put(chWord, charMap.get(chWord)+1);
			}
			else
				charMap.put(chWord, 1);
				
		}
		
		Set<Map.Entry<Character,Integer>> charSet = charMap.entrySet();
		for(Map.Entry<Character, Integer> set : charSet) {
			if(set.getValue()>1) {
				System.out.println(set.getKey()+"-"+set.getValue());
			}
			
		}
	}

	public static void repetedCharacterCount(String text) {
		int count =0;
		char[] ch = text.toCharArray();
		for(int i=0;i<text.length();i++) {
			for(int j=i+1;j<text.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					System.out.println(ch[i]+"-Repeated character");
					break;
				}
			}
		}
		System.out.println(count);
	}

	public static void armStrongNumber(int num) {
		int num1 = num;
		int temp = 0;
		while (num > 0) {
			int a = num % 10;
			temp = temp + (a * a * a);
			num = num / 10;
		}
		if (num1 == temp) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong");
		}
	}

	public static void reverseNumber(int a) {

		int num = a;
		int temp = 0;
		while (a > 0) {
			int b = a % 10;
			temp = temp * 10 + b;
			a = a / 10;
		}
		if (temp == num) {
			System.out.println("Palindrome number");
		} else
			System.out.println("Not Palindrome number");
	}

	public static void mailChecker(String a) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9_.*]+@[a-z0-9]+.[a-z]{2,3}$");
		Matcher m = p.matcher(a);
		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}

	public static int subStringTotal(String s) {
		if (s == null) {
			return 0;
		}
		int n = s.length();
		Set<String> subString = new HashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				subString.add(s.substring(i, j));
			}
		}
		System.out.println(subString.size());
		return subString.size();
	}

	public static void palidromeString(String aword) {

		String word = aword.toLowerCase();
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		if (rev.equals(word)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}

}
