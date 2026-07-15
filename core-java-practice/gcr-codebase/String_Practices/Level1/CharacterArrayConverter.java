import java.util.Scanner;


class CharacterArrayConverter {
    
    
    public static char[] convertToCharArrayUsingCharAt(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }
    
    
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
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a text: ");
            String text = scanner.nextLine();
            
            
            char[] userDefinedArray = convertToCharArrayUsingCharAt(text);
            
            
            char[] builtInArray = text.toCharArray();
            
            
            boolean arraysEqual = compareCharArrays(userDefinedArray, builtInArray);
            
            
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
