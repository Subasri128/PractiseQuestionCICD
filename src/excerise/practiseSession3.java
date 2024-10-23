package excerise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practiseSession3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		duplicateOccuranceStr("Subasri");
//		duplicateOccuranceStr("Skies the limit");
//		duplicateOccuranceStr("");
//		duplicateOccuranceStr(null);
//		duplicateOccuranceStr("D");
//		duplicateOccuranceStr("Verbs");
		int[] b = { 2, 3, 4, 5, 6, 7 };
		reverseArray(b);
		System.out.println(Arrays.toString(b));
		
		String[] strings = {"VENOM","SPIDER","ELSA","TOM","JERRY"};
		arrayReverseString(strings);
		System.out.println(Arrays.toString(strings));
//		

	}

	public static void duplicateOccuranceStr(String str) {

		if (str.isBlank()) {
			System.out.println("Empty");
		}
		if (str.length() < 1) {
			System.out.println("Another String");
		}
		if (str == null) {
			System.out.println("Null");
		}

		String lstr = str.toLowerCase();
		char[] charStr = lstr.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char a : charStr) {
			if (charMap.containsKey(a)) {
				charMap.put(a, charMap.get(a) + 1);
			} else {
				charMap.put(a, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "-" + entry.setValue(null));
			}
		}

	}

	public static void reverseArray(int[] arrNum) {
		int start = 0;
		int end = arrNum.length - 1;
		while (start < end) {
			swap(arrNum, start, end);
			start++;
			end--;
		}

	}

	private static void swap(int[] arrNumber, int index1, int index2) {
		// TODO Auto-generated method stub

		int temp = arrNumber[index1];
		arrNumber[index1] = arrNumber[index2];
		arrNumber[index2] = temp;

	}

	public static void arrayReverseString(String[] words) {
		int first = 0;
		int last = words.length - 1;
		while (first < last) {
			swapWords(words, first, last);
			first++;
			last--;
		}
	}

	private static void swapWords(String[] wordsArray, int indexa, int indexb) {
		// TODO Auto-generated method stub
		String temp = wordsArray[indexa];
		wordsArray[indexa] = wordsArray[indexb];
		wordsArray[indexb] = temp;

	}

}
