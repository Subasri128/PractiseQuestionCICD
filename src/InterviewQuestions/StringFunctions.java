package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class StringFunctions {

    public static void main(String[] args) {
        // Example usage
        String testString = "Total";
        int totalSubstrings = findTotal(testString);
        System.out.println("Total unique substrings: " + totalSubstrings);
    }

    public static int findTotal(String s) {
        if (s == null) {
            return 0; // or throw an exception
        }

        Set<String> substrings = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <=n; j++) {
                substrings.add(s.substring(i, j));
            }
        }

        return substrings.size();
    }
}