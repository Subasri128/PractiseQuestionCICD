package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class StringAndSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        // Example usage
		        String longString = "This is a sample String to demonstrate the functionality.";
		        String[] smallStrings = {"Sample", "Functionality", "java", "demonstrate"};

		        // Call the method to check if each string in smallStrings exists within longString
		        List<String> results = checkStringsInLongString(longString, smallStrings);

		        // Print results
		        for (String result : results) {
		            System.out.println(result);
		        }
		    }

		    /**
		     * This method checks if each string in the array smallStrings exists within the longString,
		     * ignoring case differences.
		     *
		     * @param longString The long string to search within.
		     * @param smallStrings The array of strings to search for.
		     * @return A list of strings that were found within the long string.
		     */
		    public static List<String> checkStringsInLongString(String longString, String[] smallStrings) {
		        // Convert the long string to lower case for case-insensitive comparison
		        String lowerCaseLongString = longString.toLowerCase();

		        // Create a list to store the results
		        List<String> foundStrings = new ArrayList<>();

		        // Iterate through each small string
		        for (String smallString : smallStrings) {
		            // Convert the current small string to lower case
		            String lowerCaseSmallString = smallString.toLowerCase();

		            // Check if the lower case small string exists within the lower case long string
		            if (lowerCaseLongString.contains(lowerCaseSmallString)) {
		                // If found, add it to the results list
		                foundStrings.add(smallString);
		            }
		        }

		        // Return the list of found strings
		        return foundStrings;
		    }



	}


