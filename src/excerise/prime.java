package excerise;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prime {
	
	public static boolean primemethod(int n) {
	if(n<=1) {
		return false;
	}
	else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	return false;

	}
	
	
		public static void main(String[] args) {
		// Pass the integer value to check whether it is prime or not.
		
/***System.out.println(primemethod(9));
System.out.println(primemethod(-9));
System.out.println(primemethod(1));
System.out.println(primemethod(6));
***/
			
			
			//Array List to Array
			List<String> vegetable = new ArrayList<String>();
			vegetable.add("lll");
			vegetable.add("ppp");
			
			String[] vegelist = new String[vegetable.size()];
			vegelist = vegetable.toArray(vegelist);
			for(int i=0;i<vegelist.length;i++) {
				System.out.println(vegelist[i]);
			}
			//Array to Array list
			
			String[] fruitlist = {"qqq","ppp","xxx"};
			List fruit = Arrays.asList(fruitlist);
			System.out.println(fruit);
			
			
			String a1 = "racecar";
			String b=a1;
			String reverse = "";
			for(int i=a1.length()-1;i>=0;i--) {
				reverse=reverse+a1.charAt(i);
			}
			System.out.println(reverse);
			if(reverse.equals(b)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not");
			}
			}
			
			
			
			
			
			
			
			
			
			
			
			


		private static char[] vegelist(int i) {
			// TODO Auto-generated method stub
			return null;
		}
}
