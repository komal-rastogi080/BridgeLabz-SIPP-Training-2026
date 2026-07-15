import java.util.Scanner;


class UsernameValidator {
    
    
    public static boolean containsSpaces(String username) {
        return username.contains(" ");
    }
    
    
    public static int countCharacters(String username) {
        return username.length();
    }
    
    
    public static String convertToUppercase(String username) {
        return username.toUpperCase();
    }
    
    
    public static boolean isPalindrome(String username) {
        
        String cleaned = username.replaceAll(" ", "").toLowerCase();
        
        
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    
    public static boolean isValidUsername(String username) {
        return !containsSpaces(username) && username.length() >= 3 && username.length() <= 20;
    }
    
    
    public static boolean containsSpecialCharacters(String username) {
        return !username.matches("[a-zA-Z0-9_]*");
    }
    
    
    public static boolean isValidFormat(String username) {
        return username.matches("[a-zA-Z0-9_]+");
    }
    
    
    public static String getUsernameStrength(String username) {
        int strength = 0;
        
        
        if (username.length() >= 8) strength++;
        
        
        if (username.matches(".*[A-Z].*")) strength++;
        
        
        if (username.matches(".*[a-z].*")) strength++;
        
        
        if (username.matches(".*[0-9].*")) strength++;
        
        
        if (username.contains("_")) strength++;
        
        if (strength <= 2) return "Weak";
        else if (strength <= 3) return "Medium";
        else return "Strong";
    }
    
    
    public static void displayValidationReport(String username) {
        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║     USERNAME VALIDATION REPORT              ║");
        System.out.println("╠═════════════════════════════════════════════╣");
        
        System.out.printf("║ Original Username       : %-25s ║\n", username);
        System.out.printf("║ Length                  : %-25d ║\n", countCharacters(username));
        System.out.printf("║ Contains Spaces         : %-25s ║\n", (containsSpaces(username) ? "Yes ❌" : "No ✓"));
        System.out.printf("║ Valid Format            : %-25s ║\n", (isValidFormat(username) ? "Yes ✓" : "No ❌"));
        System.out.printf("║ Special Characters      : %-25s ║\n", (containsSpecialCharacters(username) ? "Yes ❌" : "No ✓"));
        
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.printf("║ Uppercase Version       : %-25s ║\n", convertToUppercase(username));
        System.out.printf("║ Is Palindrome           : %-25s ║\n", (isPalindrome(username) ? "Yes ✓" : "No"));
        System.out.printf("║ Username Strength       : %-25s ║\n", getUsernameStrength(username));
        
        System.out.println("╠═════════════════════════════════════════════╣");
        
        
        if (isValidUsername(username)) {
            System.out.println("║ Status: VALID ✓                             ║");
        } else {
            System.out.println("║ Status: INVALID ❌                          ║");
            System.out.println("║                                             ║");
            System.out.println("║ Reasons:                                    ║");
            if (containsSpaces(username)) {
                System.out.println("║ - Username contains spaces                  ║");
            }
            if (countCharacters(username) < 3) {
                System.out.println("║ - Username too short (minimum 3 chars)      ║");
            }
            if (countCharacters(username) > 20) {
                System.out.println("║ - Username too long (maximum 20 chars)      ║");
            }
            if (!isValidFormat(username)) {
                System.out.println("║ - Invalid characters (only a-z, 0-9, _ OK)  ║");
            }
        }
        
        System.out.println("╚═════════════════════════════════════════════╝\n");
    }
    
    
    public static void displayGuidelines() {
        System.out.println("\n╔═════════════════════════════════════════════╗");
        System.out.println("║   USERNAME GUIDELINES                       ║");
        System.out.println("╠═════════════════════════════════════════════╣");
        System.out.println("║ • Length: 3-20 characters                   ║");
        System.out.println("║ • No spaces allowed                         ║");
        System.out.println("║ • Allowed: a-z, A-Z, 0-9, underscore (_)   ║");
        System.out.println("║ • Recommended: Mix of letters and numbers   ║");
        System.out.println("╚═════════════════════════════════════════════╝\n");
    }
    
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\n╔═════════════════════════════════════════════╗");
            System.out.println("║       USERNAME VALIDATION SYSTEM            ║");
            System.out.println("║         (Company Registration)              ║");
            System.out.println("╚═════════════════════════════════════════════╝");
            
            displayGuidelines();
            
            boolean continueValidating = true;
            
            while (continueValidating) {
                System.out.print("Enter username to validate (or 'exit' to quit): ");
                String username = scanner.nextLine();
                
                if (username.equalsIgnoreCase("exit")) {
                    System.out.println("\n✓ Thank you for using Username Validator!");
                    continueValidating = false;
                } else if (username.isEmpty()) {
                    System.out.println("\n❌ Username cannot be empty!");
                } else {
                    
                    displayValidationReport(username);
                    
                    
                    System.out.println("═══════════════════════════════════════════════\n");
                }
            }
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
