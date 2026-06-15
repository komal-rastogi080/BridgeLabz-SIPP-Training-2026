import java.util.Scanner;

/**
 * Program 3: Return all characters in a string using user-defined method
 * and compare with String built-in toCharArray() method
 */
class CharacterArrayConverter {
    
    /**
     * Method to return characters in a string without using toCharArray()
     * @param text The input string
     * @return A character array created using charAt()
     */
    public static char[] convertToCharArrayUsingCharAt(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }
    
    /**
     * Method to compare two character arrays
     * @param array1 First character array
     * @param array2 Second character array
     * @return true if arrays are equal, false otherwise
     */
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        try {
            // Take user input
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();
            
            // Convert using user-defined method
            char[] userDefinedArray = convertToCharArrayUsingCharAt(text);
            
            // Convert using built-in method
            char[] builtInArray = text.toCharArray();
            
            // Compare the two arrays
            boolean arraysEqual = compareCharArrays(userDefinedArray, builtInArray);
            
            // Display results
            System.out.println("\nCharacter Array Conversion Results:");
            System.out.println("Original text: " + text);
            System.out.println("Length: " + text.length());
            System.out.println("Arrays are equal: " + arraysEqual);
            
            System.out.println("\nUser-defined method result:");
            for (char c : userDefinedArray) {
                System.out.print(c + " ");
            }
            System.out.println();
            
            System.out.println("\nBuilt-in method result:");
            for (char c : builtInArray) {
                System.out.print(c + " ");
            }
            System.out.println();
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
