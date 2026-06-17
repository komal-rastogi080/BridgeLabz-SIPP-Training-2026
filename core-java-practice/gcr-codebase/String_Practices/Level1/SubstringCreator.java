import java.util.Scanner;


class SubstringCreator {
    
    
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
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the text: ");
            String text = scanner.nextLine();
            
            System.out.print("Enter the start index: ");
            int startIndex = scanner.nextInt();
            
            System.out.print("Enter the end index: ");
            int endIndex = scanner.nextInt();
            
            
            String userDefinedSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
            
            
            String builtInSubstring = text.substring(startIndex, endIndex);
            
            
            boolean areEqual = compareStrings(userDefinedSubstring, builtInSubstring);
            
            
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
