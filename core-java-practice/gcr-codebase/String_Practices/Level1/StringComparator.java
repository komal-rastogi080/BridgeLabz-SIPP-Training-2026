import java.util.Scanner;


class StringComparator {
    
    
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        
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
            
            System.out.print("Enter first string: ");
            String string1 = scanner.next();
            
            System.out.print("Enter second string: ");
            String string2 = scanner.next();
            
            
            boolean resultCharAt = compareStringsUsingCharAt(string1, string2);
            
            
            boolean resultEquals = string1.equals(string2);
            
            
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
