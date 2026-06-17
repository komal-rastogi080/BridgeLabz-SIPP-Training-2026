import java.util.Scanner;


class UppercaseConverter {
    
    
    public static String convertToUppercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                
                result += (char) (ch - 32);
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
            
            System.out.print("Enter text to convert to uppercase: ");
            String text = scanner.nextLine();
            
            
            String userDefinedUppercase = convertToUppercaseUsingCharAt(text);
            
            
            String builtInUppercase = text.toUpperCase();
            
            
            boolean resultsMatch = compareStrings(userDefinedUppercase, builtInUppercase);
            
            
            System.out.println("\n=== Uppercase Conversion Results ===");
            System.out.println("Original text: " + text);
            System.out.println("User-defined method: " + userDefinedUppercase);
            System.out.println("Built-in method: " + builtInUppercase);
            System.out.println("Results match: " + resultsMatch);
            
            
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
