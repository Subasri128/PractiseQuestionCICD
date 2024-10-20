package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateOccuranceInstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateString(" ");
		duplicateString("");
		duplicateString("Table");
		duplicateString("Coverage");
		duplicateString(null);
		duplicateString("subasri");
		duplicateString("  ");
		

	}
	
	public static void duplicateString(String str) {
		if(str==null) {
			System.out.println("Null String");
			return;
		}
		if(str.isEmpty() || str.contains(" ")) {
			System.out.println("Empty String");
			return;
		}
		
		if(str.length()==1) {
			System.out.println("Single char string");
			return;
		}
		
		char word[] = str.toCharArray();
		Map<Character , Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch : word) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		//Print map//very imp
		
		Set<Map.Entry<Character , Integer>> entrySet = charMap.entrySet();
		
		for(Map.Entry<Character , Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
	}

}
