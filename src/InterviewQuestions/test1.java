package InterviewQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user for the set of words
	        System.out.println("Enter a set of words (separated by spaces):");
	        String wordsInput = scanner.nextLine();
	        
	        // Store the words in a HashSet for quick lookup
	        String[] wordsArray = wordsInput.split(" ");
	        Set<String> wordsSet = new HashSet<>();
	        for (String word : wordsArray) {
	            wordsSet.add(word);
	        }

	        // Prompt the user for a sentence
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        
	        // Split the sentence into words
	        String[] sentenceWords = sentence.split(" ");
	        
	        // Count how many words from the set are in the sentence
	        int count = 0;
	        for (String word : sentenceWords) {
	            if (wordsSet.contains(word)) {
	                count++;
	            }
	        }

	        // Print the count
	        System.out.println("Count of matching words: " + count);

	        // Close the scanner
	        scanner.close();

	}

}
