import java.util.Scanner;

/**
 * Program 2: Create a substring from a String using the charAt() method
 * and compare with the String built-in substring() method
 */
class SubstringCreator {
    
    /**
     * Method to create a substring using charAt() method
     * @param text The original string
     * @param startIndex The starting index
     * @param endIndex The ending index (exclusive)
     * @return The substring created using charAt()
     */
    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > text.length() || startIndex >= endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        
        String result = "";
        for (int i = startIndex; i < endIndex; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    
    /**
     * Method to compare two strings using charAt() method
     * @param str1 First string
     * @param str2 Second string
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
            
            System.out.print("Enter the text: ");
            String text = scanner.nextLine();
            
            System.out.print("Enter the start index: ");
            int startIndex = scanner.nextInt();
            
            System.out.print("Enter the end index: ");
            int endIndex = scanner.nextInt();
            
            // Create substring using user-defined method
            String userDefinedSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
            
            // Create substring using built-in method
            String builtInSubstring = text.substring(startIndex, endIndex);
            
            // Compare the two substrings
            boolean areEqual = compareStrings(userDefinedSubstring, builtInSubstring);
            
            // Display results
            System.out.println("\nSubstring Results:");
            System.out.println("User-defined method: " + userDefinedSubstring);
            System.out.println("Built-in method: " + builtInSubstring);
            System.out.println("Substrings are equal: " + areEqual);
            
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
