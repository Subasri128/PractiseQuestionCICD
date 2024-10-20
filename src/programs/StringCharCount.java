package programs;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "String and SubString";
		String lowWord = word.toLowerCase();
		Map<Character ,Integer> map = new HashMap<Character,Integer>();
		char charWord[] = lowWord.toCharArray();
		for(char c : charWord) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(lowWord+":"+map);
		

	}

}
