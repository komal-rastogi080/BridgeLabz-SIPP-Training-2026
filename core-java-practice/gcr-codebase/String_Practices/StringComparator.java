import java.util.Scanner;

/**
 * Program 1: Compare two strings using the charAt() method 
 * and check the result with the built-in String equals() method
 */
class StringComparator {
    
    /**
     * Method to compare two strings using charAt() method
     * @param str1 First string to compare
     * @param str2 Second string to compare
     * @return true if strings are equal, false otherwise
     */
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        try {
            // Take user input for two strings
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter first string: ");
            String string1 = scanner.next();
            
            System.out.print("Enter second string: ");
            String string2 = scanner.next();
            
            // Compare using user-defined method
            boolean resultCharAt = compareStringsUsingCharAt(string1, string2);
            
            // Compare using built-in equals() method
            boolean resultEquals = string1.equals(string2);
            
            // Display results
            System.out.println("\nComparison Results:");
            System.out.println("User-defined method (charAt): " + resultCharAt);
            System.out.println("Built-in method (equals()): " + resultEquals);
            System.out.println("Both methods match: " + (resultCharAt == resultEquals));
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
