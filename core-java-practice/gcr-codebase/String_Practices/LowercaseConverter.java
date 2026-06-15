import java.util.Scanner;

/**
 * Program 10: Convert the complete text to lowercase and compare the results
 */
class LowercaseConverter {
    
    /**
     * Method to convert text to lowercase using charAt() and ASCII values
     * ASCII difference between uppercase and lowercase is 32
     * @param text The text to convert
     * @return Lowercase version of the text
     */
    public static String convertToLowercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase (ASCII 65-90)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                result += (char) (ch + 32);
            } else {
                // Keep the character as is if it's not uppercase
                result += ch;
            }
        }
        return result;
    }
    
    /**
     * Method to compare two strings using charAt() method
     * @param str1 First string to compare
     * @param str2 Second string to compare
     * @return true if strings are equal, false otherwise
     */
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        try {
            // Take user input
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter text to convert to lowercase: ");
            String text = scanner.nextLine();
            
            // Convert using user-defined method
            String userDefinedLowercase = convertToLowercaseUsingCharAt(text);
            
            // Convert using built-in method
            String builtInLowercase = text.toLowerCase();
            
            // Compare the two results
            boolean resultsMatch = compareStrings(userDefinedLowercase, builtInLowercase);
            
            // Display results
            System.out.println("\n=== Lowercase Conversion Results ===");
            System.out.println("Original text: " + text);
            System.out.println("User-defined method: " + userDefinedLowercase);
            System.out.println("Built-in method: " + builtInLowercase);
            System.out.println("Results match: " + resultsMatch);
            
            // Show character by character comparison
            System.out.println("\nCharacter by Character Comparison:");
            for (int i = 0; i < text.length(); i++) {
                System.out.println("Position " + i + ": '" + text.charAt(i) + "' -> '" 
                    + userDefinedLowercase.charAt(i) + "' (User-defined) vs '" 
                    + builtInLowercase.charAt(i) + "' (Built-in)");
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
