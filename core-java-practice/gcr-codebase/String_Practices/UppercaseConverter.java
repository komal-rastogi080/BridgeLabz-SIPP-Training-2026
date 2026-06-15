import java.util.Scanner;

/**
 * Program 9: Convert the complete text to uppercase and compare the results
 */
class UppercaseConverter {
    
    /**
     * Method to convert text to uppercase using charAt() and ASCII values
     * ASCII difference between uppercase and lowercase is 32
     * @param text The text to convert
     * @return Uppercase version of the text
     */
    public static String convertToUppercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is lowercase (ASCII 97-122)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                result += (char) (ch - 32);
            } else {
                // Keep the character as is if it's not lowercase
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
            
            System.out.print("Enter text to convert to uppercase: ");
            String text = scanner.nextLine();
            
            // Convert using user-defined method
            String userDefinedUppercase = convertToUppercaseUsingCharAt(text);
            
            // Convert using built-in method
            String builtInUppercase = text.toUpperCase();
            
            // Compare the two results
            boolean resultsMatch = compareStrings(userDefinedUppercase, builtInUppercase);
            
            // Display results
            System.out.println("\n=== Uppercase Conversion Results ===");
            System.out.println("Original text: " + text);
            System.out.println("User-defined method: " + userDefinedUppercase);
            System.out.println("Built-in method: " + builtInUppercase);
            System.out.println("Results match: " + resultsMatch);
            
            // Show character by character comparison
            System.out.println("\nCharacter by Character Comparison:");
            for (int i = 0; i < text.length(); i++) {
                System.out.println("Position " + i + ": '" + text.charAt(i) + "' -> '" 
                    + userDefinedUppercase.charAt(i) + "' (User-defined) vs '" 
                    + builtInUppercase.charAt(i) + "' (Built-in)");
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
