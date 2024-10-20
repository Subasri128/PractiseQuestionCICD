package excerise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PractiseClassSession {
	
	@Test
	public void String() {
		String name ="Results";
		int count = 0;
		
		char[] nameArray = name.toCharArray();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(nameArray[i]==nameArray[j]) {
				
					count++;
					System.out.println(nameArray[i]);
					break;
				}
			}
			
		}
		System.out.println(count);
		}
	
	@Test(enabled=false)
	public void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String a = sc.next();
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(b.equals(a)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}}
	
	

	@Test
	public void test2() {
	 String a = " CrownCrown";
	 int count =0;
	 char[] aword = a.toCharArray();
	 for(int i=0;i<aword.length;i++) {
		 for(int j=i+1;j<aword.length;j++) {
			 if(aword[i]==aword[j]) {
				 count++;
				 System.out.println(aword[i]+""+count);
				 break;
			 }
			
		 }
	 }
	 System.out.println(count);
	}
	
	@Test(enabled =false)
	public void numberArrange() {
		int[] a = {23,22,11,33,1,113,54,45};
		Arrays.sort(a);
		System.out.println(a[0]+"min number");
		System.out.println((a.length)-1+"max number");
		}
	
	
}


