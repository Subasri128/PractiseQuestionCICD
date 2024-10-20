package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class practise {
	
	@Test(enabled=false)
	public void printDuplicatecharacterinString() {
		String sentence = "Smart Insert";
		int count;
		char[] word = sentence.toCharArray();
		for(int i =0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i]==word[j] && word[i]!=' ') {
					count++;
					word[j]='0';
				}
			}
			if(count>1 && word[i]!='0') {
				System.out.println(word[i]);
			}
		}
				}
	
	@Test(enabled=false)
	public void duplicateElementinList() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(32,22,1,65,32,55,1,99,44,44));
		HashSet<Integer> checkset = new HashSet<Integer>();
		HashSet<Integer> targetset = new HashSet<Integer>();
		for(Integer integer : array) {
			if(!checkset.add(integer)) {
				targetset.add(integer);
			}
		}
		System.out.println(targetset);
	}
	@Test(enabled=false)
	public void array() {
    String[] aline = {"aa","ew","ki","pq"};
    for(int i=0;i<aline.length;i++) {
    	System.out.println(aline[i]);
    }
    }
	
	@Test(enabled=false)
	public void splitString() {
		String word = "Debug Shell";
		String[] temp = word.split("");
		
		System.out.println(Arrays.toString(temp));
	}
	
	
	@Test(enabled=false)
	public void arrayExplore() {
		String[] words = {"word","Practise","shell","process"};
	String[] clonedWords = words.clone();
	for(String s :clonedWords) {
	System.out.println(s);
	}}
	
	
	@Test(enabled=false)
	public void arrayExplore1() {
		int a[]= {33,44,323,32,45,16,77,80,40};
		for(int i=0;i<a.length;i++) {
			if(a[i] %8 ==0 && a[i] %2==0) {
				System.out.println(a[i]+"multiple of both 2,8");
				break;
			}
		}
		
	}
	@Test
	public void arrayString() {
		String[] awords = {"Coverage","Process","Dynamic","Static"};
		for(int i=awords.length-1;i>=0;i--) {
			System.out.println(awords[i]);
		}
		System.out.println(awords.length);
	}
	
	
	@Test(enabled=false)
	public void arrayString2() {
		String[] awords = {"Coverage","dell","Dynamic","Static","Dynamic","vein","dell","Static"};
		for(int i=0;i<awords.length;i++) {
			for(int j=i+1;j<awords.length;j++) {
				if(awords[i]==awords[j]) {
					System.out.println(awords[i]);
					
				}
			}
			}}
	@Test(enabled=false)
	public void arrayString3() {
		String line = "Fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
		int count;
		line=line.toLowerCase();
		String[] word = line.split(" ");
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!="0") {
				System.out.println(word[i]);
			}
		}
	}
	
	@Test(enabled=false)
	public void maxmin() {
		int[] a = {323,23,454,43,23,77,988,1001,10};
		Arrays.sort(a);
		System.out.println(a[0]+"Minimum number");
		System.out.println(a[a.length-1]+"Maxnumber");
	}
	
	@Test(enabled=false)
	public void maxminString() {
		String[] aline = {"Coverage","Class","Zoo","Noon","After","Spring"};
		Arrays.sort(aline);
		System.out.println(aline[aline.length-1]);
	}
	@Test(enabled=false)
	public void reverse() {
		String aword = "DevLabAlice Skips";
		String reverse = "";
		for(int i=aword.length()-1;i>=0;i--) {
			reverse = reverse +aword.charAt(i); 
		}
		System.out.println(reverse);
	}
	@Test(enabled=false)
	public void reversewordString() {
		String aline = "The magicians were jumping up and down with excitement";
		String rev ="";
		Pattern pattern = Pattern.compile("\\s");
		String[] awords = pattern.split(aline);
		for(int i=0;i<awords.length;i++) {
			if(i==awords.length-1) {
				rev = awords[i]+ rev;
			}
			else {
				rev = " "+awords[i]+rev;
			}
			
		}System.out.println(rev);
		
	}
	
	@Test
	public void Stringcounts() {
		String a = "magicians";
		int count =0;
		String sentence = "The magicians were jumping up and down with excitement";
		String[]wordsArray = sentence.split(" ");
		for(String word :wordsArray) {
			System.out.println(word);
			
			
			System.out.println(count);
		}
		
 	}
	
	
	
	
	
	
	
	
	
	
	@Test(enabled=false)
	public void emailChecking() {
		String email ="user123@email.co.uk";
		Pattern p = Pattern.compile("^[a-zA-Z0-9._+%]+@[a-zA-Z._]+\\.[a-z]{2,3}$");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	
    }    
	
	

			
	


