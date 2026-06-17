import java.util.Scanner;


class LowercaseConverter {
    
    
    public static String convertToLowercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                
                result += (char) (ch + 32);
            } else {
                
                result += ch;
            }
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
            
            System.out.print("Enter text to convert to lowercase: ");
            String text = scanner.nextLine();
            
            
            String userDefinedLowercase = convertToLowercaseUsingCharAt(text);
            
            
            String builtInLowercase = text.toLowerCase();
            
            
            boolean resultsMatch = compareStrings(userDefinedLowercase, builtInLowercase);
            
            
            System.out.println("\n=== Lowercase Conversion Results ===");
            System.out.println("Original text: " + text);
            System.out.println("User-defined method: " + userDefinedLowercase);
            System.out.println("Built-in method: " + builtInLowercase);
            System.out.println("Results match: " + resultsMatch);
            
            
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
